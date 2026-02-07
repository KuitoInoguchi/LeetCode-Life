package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SingleNumber {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }
            int res = 0;
            for (int i : map.keySet()) {
                if (map.get(i) == 1) {
                    res = i;
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        // put your test code here
        
    }
}