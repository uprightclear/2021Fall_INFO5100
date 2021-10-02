package Leetcode;

import question1_1.Main;

public class question2_2 {
    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        String word3 = "makes";
        System.out.println(shortestWordDistance(words, word1, word2));
        System.out.println(shortestWordDistance(words, word1, word3));
    }

    public static int shortestWordDistance(String[] words, String word1, String word2) {
        int ans = words.length;
        int index1 = -1, index2 = -1;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) index1 = i;
            else if(words[i].equals(word2)) index2 = i;

            if(index1 != -1 && index2 != -1) ans = Math.min(ans, Math.abs(index1 - index2));
        }

        return ans;
    }
}
