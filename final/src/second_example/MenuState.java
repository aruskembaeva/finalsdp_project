package second_example;

import java.util.Scanner;

public class MenuState implements State{

    @Override
    public void justDoIt() {
        MenuPage menuPage = new MenuPage();
        menuPage.addProducts("Burger");
        menuPage.addProducts("Pizza");
        menuPage.addProducts("Sushi");

        System.out.println("Please, enter your name:");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Please, enter your phone number:");
        Scanner pn = new Scanner(System.in);
        String phoneNumber = pn.nextLine();

        System.out.println("Please, enter your address:");
        Scanner adrs = new Scanner(System.in);
        String address = adrs.nextLine();

        Observer subscriber = new Subscriber(name, phoneNumber, address);

        menuPage.addObserver(subscriber);

        menuPage.addProducts("Sushi2");
        System.out.println("What do you want to buy? Enter the number of your product:");
        Scanner indx = new Scanner(System.in);
        int index = indx.nextInt();
        menuPage.removeProduct(index - 1);
    }
}
