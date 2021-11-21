package decorator;

import strategy.CreditCardStrategy;

public class StrawberryIcecream extends Icecream{
    public StrawberryIcecream(){
        description="Strawberry Ice cream";
    }
    public int getCost(){
        return 20;
    }
}