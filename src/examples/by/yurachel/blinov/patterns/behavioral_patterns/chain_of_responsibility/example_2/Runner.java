package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example_2;

public class Runner {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SmsNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

//        report.notifyManager("ok", Priority.ROUTINE);
        report.notifyManager("something wrong", Priority.IMPORTANT);
//        report.notifyManager("we have big problem", Priority.ASAP);

    }
}
