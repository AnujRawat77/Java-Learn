package LearnJava.Core.Strings;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        
        System.out.println("Original String: "+ str);
        System.out.println("Reversed String: " + sb.toString());
    }
}
