package question1_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] example = {1, 2, 3, 2, 4};
        System.out.println(uniqueSum(example));
    }

    private static int uniqueSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1) ans += key;
        }

        return ans;
    }
}
