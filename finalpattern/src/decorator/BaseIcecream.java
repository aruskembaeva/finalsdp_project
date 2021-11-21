package decorator;

import strategy.CreditCardStrategy;

public class BaseIcecream extends Icecream{

    public BaseIcecream(){
        description="Base Ice cream`s";
    }

    public  int getCost(){
        return 10;
    }


}
