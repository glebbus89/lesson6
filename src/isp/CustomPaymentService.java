package isp;

public class CustomPaymentService extends PaymentService implements WebMoneyPayable, CreditCardPayable   {

    @Override
    public void payWebMoney(double amount) {
        System.out.printf("Internet pay by web money %.2f\n", amount);
    }

    @Override
    public void payCreditCard(double amount) {
        System.out.printf("Internet pay by credit card %.2f\n", amount);

    }
}
