package decorator;

import strategy.CreditCardStrategy;

public class NuttyDecorator extends IcecreamDecorator{
    Icecream icecream;
    public NuttyDecorator(Icecream icecream) { this.icecream = icecream; }
    public String getDescription() {
        return icecream.getDescription() + ", Nutty";
    }
    public int getCost() { return 10 + icecream.getCost() ; }
}
