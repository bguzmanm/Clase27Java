import cl.praxis.openClose.Contractor;
import cl.praxis.openClose.FullTimeEmployee;
import cl.praxis.openClose.PartimeEmployee;

public class Main {
  public static void main(String[] args) {

    FullTimeEmployee fe = new FullTimeEmployee("Pepito", "Gutierrez", "1-1", 4000);
    PartimeEmployee pe = new PartimeEmployee("Florencio", "Monsalve", "2-2", 50, 40);
    System.out.println(fe.calculateSalary());
    System.out.println(pe.calculateSalary());

    Contractor c = new Contractor("Fulanito", "Martinez", "3.3", 50000);

    System.out.println(c.calculateSalary());




  }

}