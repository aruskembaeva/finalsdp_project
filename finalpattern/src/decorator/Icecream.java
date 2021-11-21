package decorator;

import strategy.CreditCardStrategy;

public abstract class Icecream {
    String description="Ice cream";

    public String getDescription(){
        return description;
    }

     public int getCost() {
         return 0;
     }



}
