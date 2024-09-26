package atm;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OptionsMenu extends Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("₹#,###.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int i = 1;
        do {
            try {
                data.put(639739680, 11021);
                data.put(703714572, 12151);
                System.out.println("Welcome to ATM project!");
                System.out.print("Enter your Customer number: ");
                setCustomerNumber(sc.nextInt());
                System.out.print("Enter your pin: ");
                setPinNumber(sc.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s), only numbers are required." + "\n");

            }
            boolean validLogin = false;
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey().equals(getCustomerNumber()) && entry.getValue().equals(getPinNumber())) {
                    validLogin = true;
                    getAccountType();
                    break;
                }
            }

            if (!validLogin) {
                System.out.println("\n" + "Wrong Customer or Pin Number" + "\n");
            }


            i=2;

        } while (i==1);
    }

    public void getAccountType() {
        System.out.println("Select the account you want to Access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getAccountType();
        }

    }

    public void getChecking() {
        System.out.println("Checking Account...");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                getCheckingViewBalanceInput();
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getChecking();
        }

    }

    public void getSaving() {
        System.out.println("Checking Account...");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                getSavingViewBalanceInput();
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getSaving();
        }
    }
}


