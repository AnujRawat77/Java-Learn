package LearnJava.Core.ExceptionHandling;
import java.util.*;

public class HandleZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        int num = sc.nextInt();

        System.out.print("Enter Denominator: ");
        int den = sc.nextInt();

        try{
            int res = num / den;
            System.out.println("Result: " + res);
        }catch(ArithmeticException e){
            System.out.println("Exception Occured -- Division By Zero");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Diffrent Exception Occured: "+e.getMessage());
        }
    }
}
