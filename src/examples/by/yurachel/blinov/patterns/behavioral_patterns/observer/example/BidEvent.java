package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example;

import java.util.EventObject;

public class BidEvent extends EventObject {

    public BidEvent(Bid source) {
        super(source);
    }

    @Override
    public Bid getSource() {
        return (Bid) super.getSource();
    }

}
