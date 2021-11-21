import decorator.*;
import strategy.CreditCardStrategy;
import strategy.PaypalStrategy;
import strategy.Shoppingcart;
import template1.courier;
import template1.pickup;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
           //Decorator pattern
            System.out.println("Hello!!"+"\nWhat`s your name?");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            System.out.println("\nDear " + name + "\nMenu:" + "\n1.Base Icecream");

                Icecream icecream = new BaseIcecream();
                System.out.println(icecream.getDescription() + " Cost:\n" + icecream.getCost());
            System.out.println("\n2.Chocolate Ice cream + nutty");
                Icecream icecream1 = new chocolateIcecream();
                icecream1 = new NuttyDecorator(icecream1);
                System.out.println(icecream1.getDescription() + " Cost:\n" + icecream1.getCost());
            System.out.println("\n2.Strawberry Ice cream + honey+M&M`s");
                Icecream icecream2 = new StrawberryIcecream();
                icecream2 = new HoneyDecorator(icecream2);
                icecream2 = new mmsDecorator(icecream2);
                System.out.println(icecream2.getDescription() + " Cost:\n" + icecream2.getCost());
            System.out.println("\n4.Base Ice cream + caramel+nutty+M&M`s");
            Icecream icecream3 = new StrawberryIcecream();
            icecream3 = new HoneyDecorator(icecream3);
            icecream3 = new mmsDecorator(icecream3);
            System.out.println(icecream3.getDescription() + " Cost:\n" + icecream3.getCost());

                System.out.println("Choose a icecream");
                Scanner sc1 = new Scanner(System.in);
                int number2 = sc1.nextInt();
                if (number2 == 1) {
                    System.out.println(icecream.getDescription() + " Total cost:" + icecream.getCost());
                }
                if (number2 == 2) {
                    System.out.println(icecream1.getDescription() + " Total cost:" + icecream1.getCost());
                }
                if (number2 == 3) {
                    System.out.println(icecream2.getDescription() + " Total cost: " + icecream2.getCost());
                }
            if (number2 == 4) {
                System.out.println(icecream3.getDescription() + " Total cost: " + icecream3.getCost());
            }

            //Strategy pattern
                Shoppingcart cart = new Shoppingcart();
                System.out.println("Select a Payment Method:" + "\n1.Paypal" + "\n2.CreditCard");
                Scanner sc2 = new Scanner(System.in);
                int number1 = sc2.nextInt();
                if (number1 == 1) {
                    //pay by paypal
                    cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
                }
                if (number1 == 2) {
                    //pay by credit card
                    cart.pay(new CreditCardStrategy("Uskembaeva Aruzhan", "1234567890123456", "786", "12/15"));
                }
                //Template pattern
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

