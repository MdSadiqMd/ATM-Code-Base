import java.text.DecimalFormat;
import java.util.*;

public class User_Account {
    private int CustomerNumber;
    private int PinNumber;
    private double CheckingBalance=0;
    private double SavingBalance=0;

    Scanner sc=new Scanner(System.in);
    DecimalFormat CurrencyFormat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int CustomerNumber){
        this.CustomerNumber=CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber(){
        return CustomerNumber;
    }

    public int setPinNumber(int PinNumber){
        this.PinNumber=PinNumber;
        return PinNumber;
    }

    public int getPinNumber(){
        return PinNumber;
    }

    public double getCheckingBalance(){
        return CheckingBalance;
    }

    public double getSavingBalance(){
        return SavingBalance;
    }

    public double calcCheckingWithDraw(double amount){
        CheckingBalance=(CheckingBalance - amount);
        return CheckingBalance;
    }

    public double calcSavingWithDraw(double amount){
        SavingBalance=(SavingBalance - amount);
        return SavingBalance;
    }

    public double calcCheckingDeposit(double amount){
        CheckingBalance=(CheckingBalance + amount);
        return CheckingBalance;
    }

    public double calcSavingDeposit(double amount){
        SavingBalance=(SavingBalance + amount);
        return SavingBalance;
    }

    public void getCheckingWithDraw(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(CheckingBalance));
        System.out.println("Enter the Amount you want to WithDraw ");
        double amount=sc.nextDouble();
        if((CheckingBalance - amount)>=0){
            calcCheckingWithDraw(amount);
            System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Enter valid Amount");
        }
    }

    public void getSavingWithDraw(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(SavingBalance));
        System.out.println("Enter the Amount you want to WithDraw ");
        double amount=sc.nextDouble();
        if((SavingBalance - amount)>=0){
            calcSavingWithDraw(amount);
            System.out.println("Checking Account Balance: "+moneyFormat.format(getSavingBalance()));
        } else {
            System.out.println("Enter valid Amount");
        }
    }

    public void getCheckingDeposit(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(CheckingBalance));
        System.out.println("Enter the Amount you want to WithDraw ");
        double amount=sc.nextDouble();
        if((CheckingBalance + amount)>=0){
            calcCheckingWithDraw(amount);
            System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Enter valid Amount");
        }
    }

    public void getSavingDeposit(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(CheckingBalance));
        System.out.println("Enter the Amount you want to WithDraw ");
        double amount=sc.nextDouble();
        if((CheckingBalance + amount)>=0){
            calcCheckingWithDraw(amount);
            System.out.println("Checking Account Balance: "+moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Enter valid Amount");
        }
    }
}
