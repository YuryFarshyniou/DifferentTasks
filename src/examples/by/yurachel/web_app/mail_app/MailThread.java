package examples.by.yurachel.web_app.mail_app;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailThread extends Thread {
    private MimeMessage message;
    private String sendToEmail;
    private String mailSubject;
    private String mailText;
    private Properties properties;

    public MailThread(String sendToEmail, String mailSubject, String mailText, Properties properties) {
        this.sendToEmail = sendToEmail;
        this.mailSubject = mailSubject;
        this.mailText = mailText;
        this.properties = properties;
    }

    private void init() {
        //Объект почтовой сессии.
        Session mailSession = (new SessionCreator(properties)).createSession();
        mailSession.setDebug(true);
        //Создание объекта почтового сообщения.
        message = new MimeMessage(mailSession);
        try {
            //Загрузка параметров в объект почтового сообщения.
            message.setSubject(mailSubject);
            message.setContent(mailText, "text/html");
            message.setRecipient(MimeMessage.RecipientType.TO,
                    new InternetAddress(sendToEmail));

        } catch (AddressException e) {
            System.err.println("Wrong address: " + sendToEmail + " " + e);
        } catch (MessagingException e) {
            System.err.println("Formatting message error" + e);
        }
    }
    public void run(){
        init();
        try{
            //Отправка почтового сообщения.
            Transport.send(message);
        }catch(MessagingException e){
            System.err.println("Sendin message error");
        }
    }
}
