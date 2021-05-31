package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuctionObserver implements Observer {
    private List<Bid> list = new ArrayList<>();

    public void addObserver(Bid bid) {
        list.add(bid);

    }

    public void removeObserver(Bid bid) {
        // Удаление объекта из списка наблюдателя.
    }

    @Override
    public void handleEvent(BidEvent event) {
        double newPrice = event.getSource().getPrice();
        double price = 0;
        Iterator<Bid> iterator = list.iterator();
        boolean lead = true;
        while (iterator.hasNext()) {
            Bid bid = iterator.next();
            price = bid.getPrice();
            if (newPrice > price) {
                bid.setLeader(false);

            } else if (newPrice < price) {
                lead = false;
            }
        }
        if (lead) {
            event.getSource().setLeader(true);
            LeaderInfo.currentPrice = newPrice;
            System.out.println("Leading price " + newPrice);
        }
    }
}
