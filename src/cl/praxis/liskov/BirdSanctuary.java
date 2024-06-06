package cl.praxis.liskov;

public class BirdSanctuary {

  public void makeBirdsEat(Bird[] birds){
    for (Bird bird : birds) {
      bird.eat();
    }
  }
  public void makeBirdsFly(FlyingBird[] flyingBirds){
    for (FlyingBird flyingBird : flyingBirds) {
      flyingBird.fly();
    }
  }

  public static void main(String[] args) {
    Bird[] birds = { new Eagle(), new Penguin()};
    FlyingBird[] flyingBird = {new Eagle()};

    BirdSanctuary sanctuary = new BirdSanctuary();
    sanctuary.makeBirdsEat(birds);

    // pingüino no implementa métodos que no necesita. Liskov
    sanctuary.makeBirdsFly(flyingBird);

  }

}
