package isp;

public class InternetPaymentService extends PaymentService implements WebMoneyPayable,CreditCardPayable, PhonePayable {
    @Override
    public void payWebMoney(double amount) {
        System.out.printf("Internet pay by web money %.2fn", amount);
    }

    @Override
    public void payCreditCard(double amount) {
        System.out.printf("Internet pay by credit card %.2f\n", amount);
    }

    @Override
    public void payPhoneNumber(double amount) {
        System.out.printf("Internet pay by phone number %.2f\n", amount);
    }
}
