package LearnJava.Core.ExceptionHandling;

class Bank{
    private String name;
    private double amount;

    public Bank(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double withdrawAmount) throws IllegalArgumentException{
        if( withdrawAmount > amount )
            throw new IllegalArgumentException("Insufficient Funds for withdrawl amount of "+ withdrawAmount);

        amount -= withdrawAmount;
        System.out.println("Withdrawal of " + withdrawAmount + " successful. Remaining balance: " + amount);;
    }
}
public class BankTransaction {

    public static void main(String[] args) {
        Bank b1 = new Bank("Anuj", 1000.15);
        
        try {
            b1.withdraw(1500.76);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Occured: "+e.getMessage());
        }
    }
}
