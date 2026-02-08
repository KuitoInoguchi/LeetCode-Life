package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RangeSumQueryImmutable {

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {
        private int[] data;

        public NumArray(int[] nums) {
            data = new int[nums.length];
            System.arraycopy(nums, 0, data, 0, nums.length);
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += data[i];
            }
            return sum;
        }
    }

    
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
    //leetcode submit region end(Prohibit modification and deletion)

    
//    public static void main(String[] args) {
//        NumArray solution = new RangeSumQueryImmutable().new NumArray{1, 2});
//        // put your test code here
//
//    }
}