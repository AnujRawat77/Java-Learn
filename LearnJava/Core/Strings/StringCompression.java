package LearnJava.Core.Strings;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder("");

        sb.append(str.charAt(0));
        int cnt = 1;
        for( int i=1 ; i<str.length() ; i++ ){
            if( sb.charAt(sb.length()-1) == str.charAt(i)){
                cnt++;
            }else {
                if( cnt > 1) 
                    sb.append(cnt);
                sb.append(str.charAt(i));
                cnt = 1;
            }
        }
        if( cnt > 1) 
            sb.append(cnt);

        System.out.println("Compressed String: "+sb.toString());

    }
}
