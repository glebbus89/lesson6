package isp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<CreditCardPayable> paymentServices = new ArrayList<>();
        paymentServices.add(new InternetPaymentService());
        paymentServices.add(new CustomPaymentService());

        for (CreditCardPayable paymentService: paymentServices) {
            paymentService.payCreditCard(2000);
            break;
        }
    }

}
