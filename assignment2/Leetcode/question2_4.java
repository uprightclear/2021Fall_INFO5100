package Leetcode;

import java.util.Arrays;

public class question2_4 {
    public static void main(String[] args) {
        int[][] example = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(example);
        for(int[] rows : example){
            System.out.println(Arrays.toString(rows));
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
