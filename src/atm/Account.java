package atm;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner sc= new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("₹#,###.00");
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    public void setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance=savingBalance-amount;
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance=checkingBalance+amount;
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance=savingBalance+amount;
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking acc balance: "+money.format(checkingBalance));
        System.out.print("Enter amount you wanna withdraw from checking acc: ");
        double amount = sc.nextDouble();
        if((checkingBalance-amount)>0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking acc balance: "+money.format(checkingBalance));
        }
        else{
            System.out.println("Insufficient Balance."+"\n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving acc balance: "+money.format(savingBalance));
        System.out.print("Enter amount you wanna withdraw from saving acc: ");
        double amount = sc.nextDouble();
        if((savingBalance-amount)>0){
            calcSavingWithdraw(amount);
            System.out.println("New saving acc balance: "+money.format(savingBalance));
        }
        else{
            System.out.println("Insufficient Balance."+"\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving acc balance: "+money.format(savingBalance));
        System.out.print("Enter amount you wanna deposit to saving acc: ");
        double amount = sc.nextDouble();
        calcSavingDeposit(amount);
        System.out.println("New saving acc balance: "+money.format(savingBalance));


    }
    public void getCheckingDepositInput(){
        System.out.println("Checking acc balance: "+money.format(checkingBalance));
        System.out.print("Enter amount you wanna deposit to checking acc: ");
        double amount = sc.nextDouble();
        calcCheckingDeposit(amount);
        System.out.println("New Checking acc balance: "+money.format(checkingBalance));
    }
    public void getCheckingViewBalanceInput(){
        System.out.println("Checking Account Balance: " + money.format(checkingBalance));
    }
    public void getSavingViewBalanceInput(){
        System.out.println("Checking Account Balance: " + money.format(savingBalance));
    }
}
