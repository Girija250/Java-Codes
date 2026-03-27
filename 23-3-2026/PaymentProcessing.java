import java.util.*;
abstract class Payment {
    abstract void pay(int amount);
}

class CreditCard extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}


class NetBanking extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int amount = sc.nextInt();

            Payment p;
            if (type.equalsIgnoreCase("CreditCard")) {
                p = new CreditCard();
            } else if (type.equalsIgnoreCase("UPI")) {
                p = new UPI();
            } else if (type.equalsIgnoreCase("NetBanking")) {
                p = new NetBanking();
            } else {
                System.out.println("Invalid payment type");
                continue;
            }

            p.pay(amount);
        }

        sc.close();
    }
}