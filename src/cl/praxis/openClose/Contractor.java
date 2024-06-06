package cl.praxis.openClose;

public class Contractor extends Employee {

  private double fixedRate;

  public Contractor() {
  }

  public Contractor(String name, String last_name, String dni, double fixedRate) {
    super(name, last_name, dni);
    this.fixedRate = fixedRate;
  }

  @Override
  public double calculateSalary() {
    return fixedRate;
  }
}
