package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConcretePhoneOperatorMediator implements PhoneOperatorMediator {
    private Set<PhoneSubscriber> subscribers;
    private Map<PhoneSubscriber, PhoneSubscriber> connections;
    private long nextPhoneNumber;

    public ConcretePhoneOperatorMediator() {
        subscribers = new HashSet<>();
        connections = new HashMap<>();
        nextPhoneNumber = 200_00_01;
    }

    @Override
    public long generatePhoneNumber() {
        return nextPhoneNumber++;
    }

    @Override
    public void addPhoneSubscriber(PhoneSubscriber ps) {
        subscribers.add(ps);
    }

    @Override
    public boolean isSupported(PhoneSubscriber ps) {
        boolean isSupported = subscribers.contains(ps);
        if (!isSupported) {
            System.out.println("Not supported " + ps);
        }
        return isSupported;
    }

    @Override
    public boolean connect(PhoneSubscriber ps1, PhoneSubscriber ps2) {
        if (!isSupported(ps1) || !(isSupported(ps2))) {
            return false;
        }
        if (connections.containsKey(ps1) || connections.containsKey(ps2)) {
            System.out.println("Line is busy: ");
            return false;
        }
        connections.put(ps1, ps2);
        connections.put(ps2, ps1);
        System.out.println(ps1 + " connected to " + ps2);
        return true;
    }

    @Override
    public boolean disconnect(PhoneSubscriber ps) {
        if (connections.containsKey(ps)) {
            PhoneSubscriber ps2 = connections.get(ps);
            connections.remove(ps);
            connections.remove(ps2);
            System.out.println(ps + " disconnected from " + ps2);
            return true;
        } else {
            System.out.println(ps + " not connected to any subscriber.");
            return false;
        }
    }
}
