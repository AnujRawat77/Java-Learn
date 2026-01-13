package LearnJava.Core.Strings;
import java.util.*;

public class ReplaceChar {
    public static void main(String[] args) {
        
        String s = "abcdefghi";

        System.out.println(s);

        char[] chars = s.toCharArray();
        
        chars[1] = '7';
        String s1 = new String(chars);

        System.out.println(s1);
    }
}
