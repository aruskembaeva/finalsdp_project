package decorator;



public class caramelDecorator  extends IcecreamDecorator{
    Icecream icecream;
    public caramelDecorator(Icecream icecream) { this.icecream = icecream; }
    public String getDescription() {
        return icecream.getDescription() + ", Caramel ";
    }
    public int getCost() { return 20+icecream.getCost(); }
}
