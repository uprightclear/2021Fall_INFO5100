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
        int m = ransomNote.length();
        int n = magazine.length();
        int[] arr = new int[26];

        if(m > n) return false;

        for(int i = 0; i < n; i++){
            arr[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < m; i++){
            if(--arr[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
