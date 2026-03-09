package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class FindTheDuplicateNumber {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findDuplicate(int[] nums) {
            int dup = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        dup = nums[i];
                        break;
                    }
                }
                if (dup != 0) {
                    break;
                }
            }
            return dup;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
        // put your test code here
        
    }
}