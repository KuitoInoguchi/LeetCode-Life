package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class AddTwoNumbers {

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode p1 = l1, p2 = l2;
            ListNode sentinel = new ListNode(0);
            ListNode p = sentinel;
            while (p1 != null || p2 != null) {
                int digitSum = p1.val + p2.val;
                p.next = new ListNode(digitSum % 10);
                p1 = p1.next;
                p2 = p2.next;
                p = p.next;
                if (digitSum >= 10) {
                    p1.val += 1;
                }
                if (p1.next == null) {
                    p1.next = new ListNode(0);
                }
                if (p2.next == null) {
                    p2.next = new ListNode(0);
                }
            }
            return sentinel.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
        // put your test code here
        
    }
}