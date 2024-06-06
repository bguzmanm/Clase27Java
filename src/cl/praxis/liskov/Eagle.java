package cl.praxis.liskov;

public class Eagle extends FlyingBird {
  @Override
  public void fly() {
    System.out.println("el águila está volando");
  }

  @Override
  public void eat() {
    System.out.println("el águila está comiendo");

  }
}
