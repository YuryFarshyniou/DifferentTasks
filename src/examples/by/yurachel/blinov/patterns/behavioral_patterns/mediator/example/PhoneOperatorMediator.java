package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example;

public interface PhoneOperatorMediator {
    long generatePhoneNumber();

    void addPhoneSubscriber(PhoneSubscriber ps);

    boolean isSupported(PhoneSubscriber ps);

    boolean connect(PhoneSubscriber ps1, PhoneSubscriber ps2);

    boolean disconnect(PhoneSubscriber ps);
}
