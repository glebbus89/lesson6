package srp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {


        ArrayList<Order> orders = new ArrayList<>();

        TakeOrders takeFromConsole = new TakeOrderFromConsole();
        SaveOrders toJSON = new SaveOrderToJSON();


        Scanner input = new Scanner(System.in);
        System.out.print("Input the order quantity: ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("Input the order");
            orders.add(takeFromConsole.takeNewOrder());
            System.out.println(orders.get(i));
        }

        for (Order order : orders) {
            toJSON.saveOrder(order);

        }

        System.out.println("Order saved: ");

        input.close();
    }
}
