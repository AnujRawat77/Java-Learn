package LearnJava.Core.Strings;
import java.util.*;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        String parts[] = name.split(" ");

        String firstName = parts[0];
        String lastName = parts[1];

        System.out.println("First Name: "+firstName.toUpperCase());
        System.out.println("Last Name: "+lastName.toUpperCase());
    }

}
