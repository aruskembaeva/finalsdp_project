# finalsdp_project
Final project
SE-2017
Uskembaeva Aruzhan,Naziya Baisakalova
1 Example
In this example we used 3 patterns: observer, adapter and state, that connected adapter and observer with each other.

The Main class is the State class that starts runnibg our code.

Here State Pattern has 2 states: MenuState and DeliveryState.

MenuState is using Observer pattern, it shows Subscribers(us) what products do we have.
DelivarySate is using Adapter pattern, it makes an adapter berween PickUp and Delivery with Courier.

public class Main {
    public static void main(String[] args) {
        State state = new MenuState();
        StepByStep steps = new StepByStep();

        steps.setState(state);

        for(int i =1;i<3;i++){
            System.out.print(i+") ");
            steps.justDoIt();               //justDoIt(): runs the examples of Observer and Adapter patterns
            steps.changeStep();             //changeStep(): changes states
        }
    }
}

Here we have 4 interfaces:
1)State - State pattern, it is a parent of MenuState and DeliveryState
2)Observer - Observer pattern, he is a parent of subscribers(clients), has a handleEvent() method
3)Observed - Observer pattern, he is a parent of Menu Page(that control admins), can add, remove and notify Clients about changings in Menu
4)Delivery - Adapter pattern, he is a parent of PickUpAdapter and Courier classes, has a delivery method.


2nd example
This project is about ice cream delivery.
In this example we used 3 patterns: template,strategy,decorator,state, that connected template,strategy and decorator with each other
In decorator pattern,it shows what products do we have.
Template pattern,about delivery (pick up or courier)
Strategy pattern,we will try to implement a simple Shopping Cart where we have two payment strategies – using Credit Card or using PayPal.
