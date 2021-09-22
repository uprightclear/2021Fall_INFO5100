package question1_5;

public class Main {
    public static void main(String[] args) {
        String example = "1A3d4s5t";
        String example2 = "A2bb2d4";
        if(checkString(example)) System.out.println("It's a correct string");
        else System.out.println("It's a correct string");

        if(checkString(example2)) System.out.println("It's a correct string");
        else System.out.println("It's a wrong string");
    }

    private static boolean checkString(String s) {
        int len = s.length();
        boolean sign = false;
        char begin = s.charAt(0);
        sign = isLetter(begin) ? true : false;
        for(int i = 1; i < len; i++) {
            //pre char is letter
            if(sign && isLetter(s.charAt(i))) return false;
            //pre char is digit
            if(!sign && !isLetter(s.charAt(i))) return false;
        }
        return true;
    }

    private static boolean isLetter(Character c) {
        if((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) return true;
        else return false;
    }

}
