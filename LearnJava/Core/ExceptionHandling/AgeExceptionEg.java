package LearnJava.Core.ExceptionHandling;
import java.util.*;

class UnderAgeException extends Exception {
    public UnderAgeException(String message){
        super(message);
    }
}
public class AgeExceptionEg {

    public static void checkAge(int age) throws UnderAgeException {
        if( age <18 ) {
            throw new UnderAgeException("Age Less than 18.");
        }
        System.out.println("Access Granted. You are eligible.");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }catch(UnderAgeException e){
            System.out.println("Exception Occured: " +e.getMessage());
        }finally {
            System.out.println("Program ended....");
        }
    }
}
