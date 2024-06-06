package cl.praxis.dependencyInversion;

/**
 * Clase de alto nivel
 */
public class Notification {
  //private EmailService emailService;
  private MessageService messageService;

  public Notification(MessageService messageService) {
    this.messageService = messageService;
  }

  public void send(String mensaje){
    // emailService.sendEmail(mensaje);
    messageService.sendMessage(mensaje);
  }
}
