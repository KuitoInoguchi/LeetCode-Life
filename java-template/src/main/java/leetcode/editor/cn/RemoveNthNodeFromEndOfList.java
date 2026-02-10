package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RemoveNthNodeFromEndOfList {

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode sentinel = new ListNode(0);
            sentinel.next = head;
            ListNode p1 = sentinel;
            ListNode p2 = sentinel;
            for (int i = 0; i < n; i++) {
                p1 = p1.next;
            }
            while (p1.next != null) {
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;

            return sentinel.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        // put your test code here
        
    }
}