package Q4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String example = "abcabcbb";
        System.out.println(longestSubstring(example));
    }

    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int end = 0;
        int ans = 0;
        for(int i = 0; i < len; i++) {
            if(i > 0) set.remove(s.charAt(i - 1));
            while(end < len) {
                if(set.add(s.charAt(end))) end++;
                else break;
            }
            ans = Math.max(ans, end - i);
        }
        return ans;
    }
}
