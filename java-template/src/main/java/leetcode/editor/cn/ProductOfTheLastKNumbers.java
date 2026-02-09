package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ProductOfTheLastKNumbers {

    //leetcode submit region begin(Prohibit modification and deletion)
    class ProductOfNumbers {
        List<Integer> preProd;

        public ProductOfNumbers() {
            preProd = new LinkedList<>();
            preProd.add(1);
        }
        
        public void add(int num) {
            if (num == 0) {
                preProd.clear();
                preProd.add(1);
                return;
            }
            int n = preProd.size();
            preProd.add(preProd.get(n - 1) * num);
        }
        
        public int getProduct(int k) {
            int n = preProd.size();
            if (k > n - 1) {
                return 0;
            }
            return preProd.get(n - 1) / preProd.get(n - 1 - k);
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