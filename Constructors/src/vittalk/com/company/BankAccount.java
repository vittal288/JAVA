package vittalk.com.company;

public class BankAccount {
    private int number;
    private String customerEmailAddress;
    private String customerMobileNumber;
    private  int balance;
    private String customerName;

    public BankAccount(){
        //calling constructor from constructor
        //setting default value to the parameters
        this(12345,0,"default name","defaultNo","defaultName");
        System.out.println("Empty Constructor called !!!");
    }

    public  BankAccount(int number, int balance, String customerEmailAddress, String customerMobileNumber, String customerName){
        this.number = number;
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerMobileNumber = customerMobileNumber;
        this.customerName = customerName;

        System.out.println("BankAccount Constroctor is called with parameters");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void depositMoney(int depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount +" made. New balance is "+ this.balance);
    }
    public void withDrawMoney(int withdrawAmount){

        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of "+ withdrawAmount + " processed. Remaining Balance is "+this.balance);
        }

    }



}
