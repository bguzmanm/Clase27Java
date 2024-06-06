package cl.praxis.openClose;

public abstract class Employee {
  private String name;
  private String last_name;
  private String dni;

  public Employee() {
  }

  public Employee(String name, String last_name, String dni) {
    this.name = name;
    this.last_name = last_name;
    this.dni = dni;
  }

  public abstract double calculateSalary();

}
