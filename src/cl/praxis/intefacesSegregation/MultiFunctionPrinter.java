package cl.praxis.intefacesSegregation;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
  @Override
  public void fax(Document document) {
    System.out.println("Faxeando el documento " + document.getName());
  }

  @Override
  public void print(Document document) {
    System.out.println("imprimiendo el documento " + document.getName());

  }

  @Override
  public Document scan() {
    return new Document("scan document");
  }
}
