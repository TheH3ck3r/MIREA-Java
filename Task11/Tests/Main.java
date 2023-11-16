import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static void main(String[] args) {
    var students = new ArrayList<Student>();
    for (int i = 0; i < 50; i++) {
      students.add(new Student("student", ThreadLocalRandom.current().nextInt(0, 101)));
    }

    InsertionSort object = new InsertionSort();
    object.sort(students);
    System.out.println(students);
  }
}