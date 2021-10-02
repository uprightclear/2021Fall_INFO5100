package Leetcode;

import java.util.Arrays;

public class question2_1 {
    public static void main(String[] args) {
        int[][] example = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = transpose(example);
        for(int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
