package Leetcode;

public class question2_8 {
    public static void main(String[] args) {
        String example = "A man, a plan, a canal: Panama";
        if(isPalindrome(example)) System.out.println("true");
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))) {
                    return false;
                }
            }
        }
        return true;
    }
}
