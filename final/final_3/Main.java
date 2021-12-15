package final_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(countSub(nums, 2));
        int[] nums2 = {1, 2, 3};
        System.out.println(countSub(nums2, 3));
    }

    public static int countSub(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        map.put(0, 1);
        for(int i = 0; i < len; i++) {
            pre += nums[i];
            if(map.containsKey(pre - k)) count += map.get(pre - k);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
