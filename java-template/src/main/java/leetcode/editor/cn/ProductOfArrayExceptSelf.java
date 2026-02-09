package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ProductOfArrayExceptSelf {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] answer = new int[nums.length];
            PreProductArray preProd = new PreProductArray(nums);
            PostProductArray postProd = new PostProductArray(nums);
            for (int i = 0; i < nums.length; i++) {
                int left = Math.max(0, i - 1);
                int right = Math.min(i + 1, nums.length - 1);
                answer[i] = preProd.getPreSum(left) * postProd.getPostSum(right);
            }
            return answer;
        }
    }

    class PreProductArray {
        private int[] preProduct;

        public PreProductArray(int[] nums) {
            preProduct = new int[nums.length + 1];
            preProduct[0] = 1;
            for (int i = 1; i <= nums.length; i++) {
                preProduct[i] = preProduct[i - 1] * nums[i - 1];
            }
        }

        public int getPreSum(int to) {
            return preProduct[to + 1];
        }
    }

    class PostProductArray {
        private int[] postProduct;

        public PostProductArray(int[] nums) {
            postProduct = new int[nums.length + 1];
            postProduct[postProduct.length - 1] = 1;
            for (int i = postProduct.length - 2; i >= 0; i--) {
                postProduct[i] = postProduct[i + 1] * nums[i]; // nums[i + 1]: ArrayIndexOutOfBoundsException?
            }
        }

        public int getPostSum(int to) {
            return postProduct[to - 1];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new ProductOfArrayExceptSelf().new Solution();
        // put your test code here
        
    }
}