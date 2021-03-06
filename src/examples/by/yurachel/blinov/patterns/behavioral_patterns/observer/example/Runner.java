package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Bid bid1 = new Bid(1, 34);
        Bid bid2 = new Bid(2, 35);
        Bid bid3 = new Bid(3, 12);
        Bid bid4 = new Bid(4, 16);
        Bid bid5 = new Bid(5, 25);
        AuctionObserver observer = new AuctionObserver();
        bid1.addObserver(observer);
        bid2.addObserver(observer);
        bid3.addObserver(observer);
        bid4.addObserver(observer);
        bid5.addObserver(observer);
        List<Bid> list = new ArrayList<>();
        list.add(bid1);
        list.add(bid2);
        list.add(bid3);
        list.add(bid4);
        list.add(bid5);
        System.out.println("First: ");
        bid3.changePrice(45); // Предложение больше максимального.
        for (Bid bid : list) {
            System.out.println(bid);
        }
        System.out.println("Second: ");
        bid2.changePrice(40);  // Предложение меньше масимального.
        for (Bid bid : list) {
            System.out.println(bid);
        }
        System.out.println("Third: ");
        bid4.changePrice(50); // Предложение больше масимального.
        for (Bid bid : list) {
            System.out.println(bid);
        }
    }
}
