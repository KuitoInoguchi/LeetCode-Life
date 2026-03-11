package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class NextGreaterElementI {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int[] res = new int[n];

            Stack<Integer> s = new Stack<>();
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = nums2.length - 1; i >= 0; i--) {
                while (!s.isEmpty() && nums2[i] >= s.peek()) {
                    s.pop();
                }

                m.put(nums2[i], s.isEmpty() ? -1 : s.peek());
                s.push(nums2[i]);
            }

            for (int i = 0; i < n; i++) {
                res[i] = m.get(nums1[i]);
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new NextGreaterElementI().new Solution();
        // put your test code here
        int[] a = {4, 1, 2};
        int[] b = {1, 3, 4, 2};

        int[] res = solution.nextGreaterElement(a, b);
        System.out.println(Arrays.toString(res));
    }
}