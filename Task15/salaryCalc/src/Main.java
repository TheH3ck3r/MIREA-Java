public class Main {
  public static void main(String[] args) {
    Employee model = new Employee("Misha", 1000);
    EmployeeView view = new EmployeeView();
    EmployeeController controller = new EmployeeController(model, view);

    controller.updateView();

    controller.setEmployeeSalary(1750);

    controller.updateView();
  }
}