package second_example;

import java.util.Scanner;

public class DeliveryState implements State{

    @Override
    public void justDoIt() {
        deliveryChoose();
    }

    public static void deliveryChoose(){
        PickUp pickUp = new PickUp();
        Courier courier = new Courier();
        Delivery pickUpAdapter = new PickUpAdapter(pickUp);
        System.out.println("Will you get your order by yourself (Enter: '1') or by courier(Enter: '2')?");
        Scanner deliveryType = new Scanner(System.in);
        int type = deliveryType.nextInt();
        if(type==2) {
            courier.delivery();
        }else if(type==1) {
            pickUpAdapter.delivery();
        }else{
            System.out.println("Try again");
            deliveryChoose();
        }
    }
}
