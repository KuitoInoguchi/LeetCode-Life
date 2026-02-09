package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ProductOfTheLastKNumbers {

    //leetcode submit region begin(Prohibit modification and deletion)
    class ProductOfNumbers {
        List<Integer> data;

        public ProductOfNumbers() {
            data = new LinkedList<>();
        }
        
        public void add(int num) {
            data.add(num);
        }
        
        public int getProduct(int k) {
            int res = 1;
            int n = data.size();
            for (int i = n - 1; i >= n - k; i--) {
                res *= data.get(i);
            }
            return res;
        }
    }
    
    /**
     * Your ProductOfNumbers object will be instantiated and called as such:
     * ProductOfNumbers obj = new ProductOfNumbers();
     * obj.add(num);
     * int param_2 = obj.getProduct(k);
     */
    //leetcode submit region end(Prohibit modification and deletion)

    
//    public static void main(String[] args) {
//        Solution solution = new ProductOfTheLastKNumbers().new Solution();
//        // put your test code here
//
//    }
}