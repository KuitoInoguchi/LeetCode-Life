package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SingleNumber {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            for (int i : map.keySet()) {
                if (map.get(i) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        // put your test code here
        
    }
}