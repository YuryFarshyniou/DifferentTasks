package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example;

public class PhoneSubscriber {
    private PhoneOperatorMediator phoneOperator;
    private long phoneNumber;

    public PhoneSubscriber(PhoneOperatorMediator phoneOperator) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneOperator.generatePhoneNumber();
    }
}
