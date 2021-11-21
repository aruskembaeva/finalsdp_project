package decorator;

import strategy.CreditCardStrategy;

public class mmsDecorator extends IcecreamDecorator{
    Icecream icecream;
    public mmsDecorator(Icecream icecream) { this.icecream = icecream; }
    public String getDescription() {
        return icecream.getDescription() + ", M&M`s ";
    }
    public  int getCost() { return 30+icecream.getCost() ; }
}
