package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example;

import java.util.Objects;

public class PhoneSubscriber {
    private PhoneOperatorMediator phoneOperator;
    private long phoneNumber;

    public PhoneSubscriber(PhoneOperatorMediator phoneOperator) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneOperator.generatePhoneNumber();
    }
    public boolean call(PhoneSubscriber otherPhoneSubscriber){
        return phoneOperator.connect(this,otherPhoneSubscriber);
    }
    public boolean finishCall(){
        return phoneOperator.disconnect(this);
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneSubscriber that = (PhoneSubscriber) o;
        return phoneNumber == that.phoneNumber && Objects.equals(phoneOperator, that.phoneOperator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneOperator, phoneNumber);
    }

    @Override
    public String toString() {
        return "PhoneSubscriber{" +
                "phoneOperator=" + phoneOperator +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
