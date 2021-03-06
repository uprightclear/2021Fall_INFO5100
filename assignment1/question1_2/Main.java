package question1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] example = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(example)));
    }

    private static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0, j = len - 1, index = len - 1; i <= j;){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                ans[index] = nums[i] * nums[i];
                i++;
            }else{
                ans[index] = nums[j] * nums[j];
                j--;
            }
            index--;
        }
        return ans;
    }
}
