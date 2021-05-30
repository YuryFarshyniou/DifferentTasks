package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example;

import java.util.ArrayList;
import java.util.List;

public class AuctionObserver implements Observer {
    private List<Bid> list = new ArrayList<>();

    public void addObservable(Bid bid) {
        list.add(bid);

    }

    public void removeObservable(Bid bid) {
        // Удаление объекта из списка наблюдателя.
    }

    @Override
    public void handleEvent(BidEvent event) {

    }
}
