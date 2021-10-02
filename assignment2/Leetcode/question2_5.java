package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class question2_5 {
    public static void main(String[] args) {
        int[][] example = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(example));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        //right, down, left, up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = matrix.length, n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        boolean[][] used = new boolean[m][n];
        used[0][0] = true;
        int x = 0, y = 0, k = 0;
        res.add(matrix[0][0]);
        for(int i = 1; i < m * n; i++){
            int newx = x + directions[k % 4][0];
            int newy = y + directions[k % 4][1];
            if(newx < 0 || newx == m || newy < 0 || newy == n || used[newx][newy]){
                k++;
                newx = x + directions[k % 4][0];
                newy = y + directions[k % 4][1];
            }
            res.add(matrix[newx][newy]);
            used[newx][newy] = true;
            x = newx;
            y = newy;
        }
        return res;
    }
}
