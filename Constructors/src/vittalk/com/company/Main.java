package vittalk.com.company;

public class Main {

    public static void main(String[] args) {
    	BankAccount customer1 = new BankAccount();
		System.out.println(customer1.getCustomerName());
		System.out.println(customer1.getCustomerEmailAddress());


	    customer1.depositMoney(1000);
        customer1.depositMoney(1000);
        customer1.withDrawMoney(2000);
        customer1.withDrawMoney(500);

        System.out.println("----------------------------------------");
        VipCustomer vipCustomer1 = new VipCustomer("Vittal","sample@domain.com",5000);

        System.out.println("Credit Limit " + vipCustomer1.getCreditLimit());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("Default Customer Name " +  vipCustomer.getCustomerName());

    }
}
