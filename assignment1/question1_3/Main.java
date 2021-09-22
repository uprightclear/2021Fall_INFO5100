package question1_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] example = {2, 3, 4, 2, 2, 3, 5, 7};
        int[] example2 = {2, 3, 4, 4, 2, 2, 3, 5, 5, 7, 7};
        System.out.println(findFirstDistinct(example));
        System.out.println(findFirstDistinct(example2));
    }

    private static int findFirstDistinct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }

        System.out.print("There's no non repeated integer in the given array with error code ");
        return -1;
    }
}
