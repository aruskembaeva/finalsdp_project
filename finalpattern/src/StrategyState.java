import decorator.*;
import strategy.*;
import template1.*;

import java.util.Scanner;

public class StrategyState implements State{
    @Override
    public void justDoIt() {
        Shoppingcart cart = new Shoppingcart();
        System.out.println("Select a Payment Method:" + "\n1.Paypal" + "\n2.CreditCard");
        Scanner sc2 = new Scanner(System.in);
        int number1 = sc2.nextInt();
        if (number1 == 1) {
            //pay by paypal
            cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        }
        if (number1 == 2) {
            //pay by credit card
            cart.pay(new CreditCardStrategy("Uskembaeva Aruzhan", "1234567890123456", "786", "12/15"));
        }
    }
}
