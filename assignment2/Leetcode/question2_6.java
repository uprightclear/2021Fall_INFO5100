package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class question2_6 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        String u = "adc";
        if(isIsomorphic(s, t)) System.out.println("true");
        if(!isIsomorphic(s, u)) System.out.println("false");
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }else{
                s2t.put(x, y);
                t2s.put(y, x);
            }
        }
        return true;
    }
}