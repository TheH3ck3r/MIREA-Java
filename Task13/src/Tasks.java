import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tasks {
  public void task_1(String name) {
    try (FileWriter writer = new FileWriter(name, false)) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите текст: ");
      String text = sc.nextLine();
      writer.append(text);
      writer.flush();
    } catch (IOException ex) {

      System.out.println(ex.getMessage());
    }
  }

  public void task_2(String name) {
    try (FileReader reader = new FileReader(name)) {
      // читаем посимвольно
      int c;
      while ((c = reader.read()) != -1) {
        // int grad = Integer.parseInt(String.valueOf(c));
        System.out.print((char) c);
      }
    } catch (IOException ex) {

      System.out.println(ex.getMessage());
    }
  }

  public void task_4(String name) {
    try (FileWriter writer = new FileWriter(name, true)) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите текст: ");
      String text = sc.nextLine();
      writer.append(text);
      writer.flush();
    } catch (IOException ex) {

      System.out.println(ex.getMessage());
    }
  }

}