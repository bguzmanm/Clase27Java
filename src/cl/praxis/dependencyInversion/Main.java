package cl.praxis.dependencyInversion;

public class Main {
  public static void main(String[] args) {
    MessageService email = new EmailService();
    Notification notificationWithEmail = new Notification(email);
    notificationWithEmail.send("Hola por email");

    MessageService sms = new SMSService();
    Notification notificationWithSMS = new Notification(sms);
    notificationWithSMS.send("Hola por SMS");
  }
}
