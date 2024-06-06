package cl.praxis.openClose;

public class FullTimeEmployee extends Employee {

  private double baseSalary;

  public FullTimeEmployee() {
  }

  public FullTimeEmployee(String name, String last_name, String dni, double baseSalary) {
    super(name, last_name, dni);
    this.baseSalary = baseSalary;
  }

  @Override
  public double calculateSalary() {
    return baseSalary;
  }
}
