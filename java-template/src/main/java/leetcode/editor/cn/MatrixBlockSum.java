package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MatrixBlockSum {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] matrixBlockSum(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            PreSumMatrix preSum = new PreSumMatrix(mat);
            int[][] res = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int x1 = Math.max(i - k, 0);
                    int y1 = Math.max(j - k, 0);
                    int x2 = Math.min(i + k, m - 1);
                    int y2 = Math.min(j + k, n - 1);
                    res[i][j] = preSum.sumRegion(x1, y1, x2, y2);
                }
            }
            return res;
        }
    }

    class PreSumMatrix {
        private int[][] preSum;

        public PreSumMatrix(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            preSum = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    preSum[i][j] = mat[i - 1][j - 1] + preSum[i - 1][j] +
                            preSum[i][j - 1] - preSum[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int x1, int y1, int x2, int y2) {
            return preSum[x2 + 1][y2 + 1] - preSum[x2 + 1][y1] - preSum[x1][y2 + 1] +
                    preSum[x1][y1];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new MatrixBlockSum().new Solution();
        // put your test code here
        // 测试案例 1：示例 1 (k=1)
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k1 = 1;
        printResult(1, mat1, k1, solution.matrixBlockSum(mat1, k1));

        // 测试案例 2：示例 2 (k=2, k 大于等于矩阵尺寸)
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k2 = 2;
        printResult(2, mat2, k2, solution.matrixBlockSum(mat2, k2));

        // 测试案例 3：边界情况 (k=0, 结果应为原矩阵)
        int[][] mat3 = {{5, 10}, {15, 20}};
        int k3 = 0;
        printResult(3, mat3, k3, solution.matrixBlockSum(mat3, k3));

        // 测试案例 4：单元素矩阵
        int[][] mat4 = {{100}};
        int k4 = 10;
        printResult(4, mat4, k4, solution.matrixBlockSum(mat4, k4));
    }

    private static void printResult(int id, int[][] mat, int k, int[][] result) {
        System.out.println("Test Case " + id + " (k=" + k + "):");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}