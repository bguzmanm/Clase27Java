package cl.praxis.dependencyInversion;

/**
 * Clase de bajo nivel
 * pero, implementa la abstracción
 */
public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message) {
    System.out.println("enviando email con el mensaje: " + message);
  }
}
