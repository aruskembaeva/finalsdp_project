package decorator;


import strategy.CreditCardStrategy;

public class HoneyDecorator extends IcecreamDecorator {
    Icecream icecream;
    public HoneyDecorator(Icecream icecream) { this.icecream = icecream; }
    public String getDescription() {
        return icecream.getDescription() + ", Honey ";
    }
    public  int getCost() { return 40 +icecream.getCost();}
}
