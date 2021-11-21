import java.util.Scanner;

import decorator.*;
import strategy.*;
import template1.*;

public class DecoratorState implements State{
    @Override
    public void justDoIt() {
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
        System.out.println("\n3.Strawberry Ice cream + honey+M&M`s");
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
    }
}
