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
            int carry = 0;
            while (p1 != null || p2 != null || carry > 0) {
                int sum = carry;
                if (p1 != null) {
                    sum += p1.val;
                    p1 = p1.next;
                }
                if (p2 != null) {
                    sum += p2.val;
                    p2 = p2.next;
                }
                carry = sum / 10;
                sum = sum % 10;
                p.next = new ListNode(sum);
                p = p.next;
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