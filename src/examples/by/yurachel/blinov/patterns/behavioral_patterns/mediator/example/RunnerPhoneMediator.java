package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example;

public class RunnerPhoneMediator {
    public static void main(String[] args) {
        ConcretePhoneOperatorMediator phoneOperator = new ConcretePhoneOperatorMediator();
        PhoneSubscriber ps1 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps2 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps3 = new PhoneSubscriber(phoneOperator);
        PhoneSubscriber ps4 = new PhoneSubscriber(phoneOperator);
        phoneOperator.addPhoneSubscriber(ps1);
        phoneOperator.addPhoneSubscriber(ps2);
        phoneOperator.addPhoneSubscriber(ps3);
//Попытка двух обонентов позвонить на один номер.
        ps1.call(ps2);
        ps3.call(ps2);
        //Завершение разговора и повтор попытки.
        ps2.finishCall();
        ps3.call(ps2);
        //Попытка звонка незарегистрированным абонентом.
        ps4.call(ps1);
    }
}
