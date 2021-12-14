package DecodeString;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<>();
        ptr = 0;

        while(ptr < s.length()) {
            char cur = s.charAt(ptr);
            if(Character.isDigit(cur)) {
                String digits = getDigits(s);
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ptr++;
                LinkedList<String> sub = new LinkedList<>();
                while(!"[".equals(stk.peekLast())) sub.add(stk.removeLast());
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuilder t = new StringBuilder();
                String o = getString(sub);
                while(repTime-- > 0) t.append(o);
                stk.addLast(t.toString());
            }
        }

        return getString(stk);
    }

    public String getDigits(String s) {
        StringBuilder sb = new StringBuilder();
        while(Character.isDigit(s.charAt(ptr))) {
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }

    public String getString(LinkedList<String> v) {
        StringBuilder sb = new StringBuilder();
        for(String s : v) {
            sb.append(s);
        }
        return sb.toString();
    }
}
