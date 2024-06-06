package cl.praxis.liskov;

public class Penguin extends Bird {
  @Override
  public void eat() {
    System.out.println("el pingüino está comiendo");
  }
}
