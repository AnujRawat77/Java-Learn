package LearnJava.Core.Strings;
import java.util.*;
public class HandleDuplicates {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Rohan", "Mohan", "Sohan", "Rohan", "Ram", "Kiran", "Ram");
        
        HashSet<String> hs = new HashSet<>();

        List<String> duplicateStrings = new ArrayList<>();
        for( String s : listOfStrings) {
            if( hs.contains(s))
                duplicateStrings.add(s);
            hs.add(s);
        }

        System.out.println("Duplicate Strings:");
        for( String s : duplicateStrings)
            System.out.print(s + "  ");


    }
}
