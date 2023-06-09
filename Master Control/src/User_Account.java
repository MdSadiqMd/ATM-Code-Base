import java.text.DecimalFormat;
import java.util.*;

public class User_Account {
    private int CustomerNumber;
    private int PinNumber;
    private double CheckingBalance = 0;
    private double SavingBalance = 0;

    Scanner sc = new Scanner(System.in);
    DecimalFormat CurrencyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public int setPinNumber(int PinNumber) {
        this.PinNumber = PinNumber;
        return PinNumber;
    }

    public int getPinNumber() {
        return PinNumber;
    }

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        CheckingBalance = (CheckingBalance - amount);
        return CheckingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        CheckingBalance = (CheckingBalance + amount);
        return CheckingBalance;
    }

    public double calcSavingDeposit(double amount) {
        SavingBalance = (SavingBalance + amount);
        return SavingBalance;
    }

    public void getCheckingWithdraw() {
        System.out.println("Checking Account Balance: " + CurrencyFormat.format(CheckingBalance));
        System.out.println("Enter the Amount you want to Withdraw ");
        double amount = sc.nextDouble();
        if ((CheckingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("Checking Account Balance: " + CurrencyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void getSavingWithdraw() {
        System.out.println("Saving Account Balance: " + CurrencyFormat.format(SavingBalance));
        System.out.println("Enter the Amount you want to Withdraw ");
        double amount = sc.nextDouble();
        if ((SavingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("Saving Account Balance: " + CurrencyFormat.format(getSavingBalance()));
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void getCheckingDeposit() {
        System.out.println("Checking Account Balance: " + CurrencyFormat.format(CheckingBalance));
        System.out.println("Enter the Amount you want to Deposit ");
        double amount = sc.nextDouble();
        if ((CheckingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("Checking Account Balance: " + CurrencyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void getSavingDeposit() {
        System.out.println("Saving Account Balance: " + CurrencyFormat.format(SavingBalance));
        System.out.println("Enter the Amount you want to Deposit ");
        double amount = sc.nextDouble();
        if ((SavingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("Saving Account Balance: " + CurrencyFormat.format(getSavingBalance()));
        } else {
            System.out.println("Enter a valid amount");
        }
    }
}
