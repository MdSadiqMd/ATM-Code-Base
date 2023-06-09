import java.util.*;
import java.io.IOException;
import java.text.DecimalFormat;
public class Option_Selector extends User_Account {
    Scanner UserInput=new Scanner(System.in);
    DecimalFormat CurrencyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(952141,191904);
                data.put(989947,71976);
                System.out.println("Welcome to the ATM");

                System.out.println("Enter your Customer ID");
                setCustomerNumber(UserInput.nextInt());

                System.out.println("Enter your PIN Number");
                setPinNumber(UserInput.nextInt());
            } catch (Exception e){
                System.out.println("""
                        Enter the Valid Input
                        """);
                x=2;
            }
            int ci=getCustomerNumber();
            int pin=getPinNumber();
            if(data.containsKey(ci)&&data.get(ci)==pin){
                getAccountType();
            } else{
                System.out.println("""
                        Enter valid Input
                        """);
            } while(x==1);
        }
        public void getAccountType(){
            System.out.println("""
                    Select the Service you want to Avail
                    1. Checking Account
                    2. Saving Account
                    3. Exit
                    """);
            int selection =UserInput.nextInt();

            switch (selection) {
                case 1 -> getChecking();
                case 2 -> getSaving();
                case 3 -> System.out.println("Thank you for visiting");
                default -> System.out.println("Please select the Service");
            }
        }
        public void getChecking(){
            System.out.println("Select the Service you want to Avail");
            System.out.println("""
                    1. View Balance
                    2. With Draw Funds
                    3. Deposit Funds
                    4. Exit
                    """);
            int selection=UserInput.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Checking Account Balance: "+moneyFormat.format(getChecking));
                    getAccountType();
                    break;
                case 2:
                    getCheckingWithDraw();
                    getAccountType();
                    break;
                case 3:
                    getCheckingDeposit();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for visiting");
                default:
                    System.out.println("""
                            Invalid Choice
                            """);
            }
        }
        public void getSaving(){
            System.out.println("Select the Service you want to Avail");
            System.out.println("""
                    1. View Balance
                    2. With Draw Funds
                    3. Deposit Funds
                    4. Exit
                    """);
            int selection=UserInput.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Checking Account Balance: "+moneyFormat.format(getSaving));
                    getAccountType();
                    break;
                case 2:
                    getSavingWithDraw();
                    getAccountType();
                    break;
                case 3:
                    getSavingDeposit();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for visiting");
                default:
                    System.out.println("""
                            Invalid Choice
                            """);
            }
        }
    }
}
