package cl.praxis.openClose;

public class PartimeEmployee extends Employee {

  private double hourlyRate;
  private int hoursWorked;

  public PartimeEmployee() {
  }

  public PartimeEmployee(String name, String last_name, String dni, double hourlyRate, int hoursWorked) {
    super(name, last_name, dni);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculateSalary() {
    return hourlyRate * hoursWorked;
  }
}
