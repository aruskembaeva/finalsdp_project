import decorator.*;
import strategy.*;
import template1.*;

import java.util.Scanner;

public class TemplateState implements State{
    @Override
    public void justDoIt() {
        System.out.println("Please, make your choice:"+"\n1.PickUp"+"\n2.Courier");
        pickup pickup=new pickup();
        courier courier=new courier();
        Scanner deliveryType = new Scanner(System.in);
        int type = deliveryType.nextInt();
        if(type==2) {
            courier.delivery();
            System.out.print(" Enter Phone number=> ");
            Scanner ad=new Scanner(System.in);
            String phoneNo = ad.nextLine();
            courier.setPhoneNumber(phoneNo);
            System.out.println("Please,write your address:");
            String address = ad.nextLine();
            courier.setAddress(address);
            System.out.println(courier.toString());
        }else if(type==1) {
            pickup.delivery();
            System.out.println("Your order is accepted!!!");
        }else{
            System.out.println("Not found!");
        }
    }
}
