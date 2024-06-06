package cl.praxis.intefacesSegregation;

public class BasicPrinter implements Printer {

  @Override
  public void print(Document document) {
    System.out.println("imprimiendo " + document.getName());
  }
}
