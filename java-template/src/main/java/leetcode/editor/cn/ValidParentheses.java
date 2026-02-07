package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ValidParentheses {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(rightOf(c));
                } else if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            return stack.isEmpty();
        }

        private char rightOf(char c) {
            return switch (c) {
                case '(' -> ')';
                case '[' -> ']';
                case '{' -> '}';
                default -> '\0';
            };
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        // put your test code here
        
    }
}