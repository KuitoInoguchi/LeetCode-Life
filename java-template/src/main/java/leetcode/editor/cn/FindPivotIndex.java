package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class FindPivotIndex {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int pivotIndex(int[] nums) {
            PreSumArray preSum = new PreSumArray(nums);
            for (int i = 0; i < nums.length; i++) {
                if (preSum.rangeSum(0, i) == preSum.rangeSum(i, nums.length - 1)) {
                    return i;
                }
            }
            return -1;
        }
    }

    class PreSumArray {
        private int[] preSum;

        public PreSumArray(int[] nums) {
            preSum = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                preSum[i] = preSum[i - 1] + nums[i - 1];
            }
        }

        public int rangeSum(int left, int right) {
            return preSum[right + 1] - preSum[left];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new FindPivotIndex().new Solution();
        // put your test code here
        
    }
}