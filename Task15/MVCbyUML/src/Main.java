public class Main {
  public static void main(String[] args) {
    var controller = new StudentController(retriveStudentFromDatabase("misha", "4"));
    controller.getView().printStudentDetails();
  }

  public static Model retriveStudentFromDatabase(String name, String rollNo) {
    var m = new Model();
    m.setName(name);
    m.setRollNo(rollNo);
    return m;
  }
}