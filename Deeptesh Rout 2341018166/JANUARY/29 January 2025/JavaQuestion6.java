class Payment {
    public void processPayment() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

public class JavaQuestion6 {
    public static void main(String[] args) {
        Payment[] payments = { new Payment(), new CreditCardPayment(), new PayPalPayment() };

        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
/*
 * 
 * ouput
 * 
Processing payment
Processing credit card payment
Processing PayPal payment

 */