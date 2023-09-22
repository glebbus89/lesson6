package isp;

public interface Payable {
    void payWebMoney(double amount);

    void payCreditCard(double amount);

    void payPhoneNumber(double amount);


}
