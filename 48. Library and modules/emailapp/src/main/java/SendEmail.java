import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("", ""));
        email.setSSLOnConnect(true);
        email.setFrom("");
        email.setSubject("Siemaa");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}