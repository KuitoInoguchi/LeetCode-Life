package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ImplementStackUsingQueues {

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {
        private Queue<Integer> q;
        private int top_elem;
    
        public MyStack() {
            q = new LinkedList<>();
        }
        
        public void push(int x) {
            q.offer(x);
            top_elem = x;
        }
        
        public int pop() {
            int size = q.size();
            while (size > 2) {
                q.offer(q.poll());
                size--;
            }
            top_elem = q.peek();
            q.offer(q.poll());

            return q.poll();
        }
        
        public int top() {
            return top_elem;
        }
        
        public boolean empty() {
            return q.isEmpty();
        }
    }
    
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    //leetcode submit region end(Prohibit modification and deletion)

    
//    public static void main(String[] args) {
//        Solution solution = new ImplementStackUsingQueues().new Solution();
//        // put your test code here
//
//    }
}