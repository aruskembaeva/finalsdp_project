package strategy;

import decorator.Icecream;

import java.util.ArrayList;
import java.util.List;

public class Shoppingcart {

    //List of items
    List<Icecream> icecream;

    public Shoppingcart(){
        
        this.icecream=new ArrayList<Icecream>();
    }

    public int calculateTotal(List<Icecream> icecream1){

        int sum = 0;
        for(Icecream icecream : icecream){
            sum += icecream.getCost();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal(icecream);
        paymentMethod.pay(amount);
    }
}
