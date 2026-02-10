package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class PartitionList {

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
        public ListNode partition(ListNode head, int x) {
            ListNode sBefore = new ListNode(0);
            ListNode sAfter = new ListNode(0);
            ListNode p = head;
            ListNode p1 = sBefore;
            ListNode p2 = sAfter;

            while (p != null) {
                if (p.val < x) {
                    p1.next = p;
                    p1 = p1.next;
                } else {
                    p2.next = p;
                    p2 = p2.next;
                }
                p = p.next;
            }
            p1.next = sAfter.next;
            p2.next = null;
            return sBefore.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new PartitionList().new Solution();
        // put your test code here
        
    }
}