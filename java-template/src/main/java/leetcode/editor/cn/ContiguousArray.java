package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ContiguousArray {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxLength(int[] nums) {
            int preSumLen = nums.length + 1;
            int[] preSum = new int[preSumLen];
            for (int i = 1; i < preSumLen; i++) {
                preSum[i] = preSum[i - 1] + (nums[i - 1] == 0 ? -1 : 1);
            }
            Map<Integer, Integer> sumToIndex = new HashMap<>();
            int res = 0;
            for (int i = 0; i < preSumLen; i++) {
                int sum = preSum[i];
                if (!sumToIndex.containsKey(sum)) {
                    sumToIndex.put(sum, i);
                } else {
                    res = Math.max(res, i - sumToIndex.get(sum));
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new ContiguousArray().new Solution();
        // put your test code here
        
    }
}