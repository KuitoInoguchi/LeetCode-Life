package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class TimeNeededToBuyTickets {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            Queue<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < tickets.length; i++) {
                queue.offer(i);
            }

            int time = 0;
            while (!queue.isEmpty()) {
                int front = queue.remove();
                time++;
                tickets[front]--;
                if (front == k && tickets[front] == 0) {
                    return time;
                }
                if (tickets[front] != 0) {
                    queue.offer(front);
                }
            }
            return time;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new TimeNeededToBuyTickets().new Solution();
        // put your test code here
        
    }
}