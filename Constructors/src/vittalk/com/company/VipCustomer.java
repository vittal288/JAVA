package vittalk.com.company;

public class VipCustomer {
    private String customerName;
    private String emailAddress;
    private double creditLimit;


    public VipCustomer(){
     this("Vittal","email@domain.com",10000.0) ;
    }


    public VipCustomer(String customerName, String emailAddress){
        this(customerName, emailAddress, 000.0);
    }

    public VipCustomer(String customerName, String emailAddress, double creditLimit){
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
