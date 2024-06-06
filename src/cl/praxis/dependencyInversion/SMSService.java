package cl.praxis.dependencyInversion;

/**
 * Clase de bajo nivel
 * pero, implementa la abstracción
 */
public class SMSService implements MessageService {
  @Override
  public void sendMessage(String message) {
    System.out.println("enviando SMS con el mensaje " + message);
  }
}
