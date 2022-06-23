public class Account
{
    private String number;
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    private String customerName;
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    private String customerEmailAdress;
    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }
    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }
    private String customerPhoneNumber;
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount)
    {
        this.balance+=depositAmount;
        System.out.println("Deposit of "+depositAmount);
    }
    public void withdrawl(double withdrawlAmount)
    {
        if(this.balance-withdrawlAmount<0)
        {
            System.out.println("Only"+balance+"available");
        }
        else
        {
            this.balance-=withdrawlAmount;
            System.out.println("Withdrwal of "+withdrawlAmount+" remaining "+balance);
        }
    }
}