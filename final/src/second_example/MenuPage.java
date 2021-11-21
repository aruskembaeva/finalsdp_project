package second_example;

import java.util.ArrayList;
import java.util.List;

public class MenuPage implements Observed {
    List<String> products = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addProducts (String product){
        this.products.add(product);
        notifyObservers();
    }

    public void removeProduct(int product){
        this.products.remove(product);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent(this.products);
        }
    }
}
