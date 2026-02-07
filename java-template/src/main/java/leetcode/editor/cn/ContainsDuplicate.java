package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ContainsDuplicate {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                if (set.contains(i)) {
                    return true;
                }
                set.add(i);
            }
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
        // put your test code here
        
    }
}