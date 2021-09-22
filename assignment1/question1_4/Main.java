package question1_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        if(construct(ransomNote, magazine)) System.out.println("It can be constructed from magazine");
        else System.out.println("It can't be constructed from magazine");
    }

    private static boolean construct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char s : ransomNote.toCharArray()) {
            if(map.get(s) == 0) return false;
            map.put(s, map.get(s) - 1);
        }

        return true;
    }
}
