
public class main {
  public static void main(String[] args) {

    String name = "some data for write text";

    Tasks task = new Tasks();
    System.out.println("1: Реализовать запись в файл введённой с клавиатуры информации");
    task.task_1(name);
    System.out.println("2: Реализовать вывод информации из файла на экран");
    task.task_2(name);
    System.out.println('\n' + "3: Заменить информацию в файле на информацию, введённую с клавиатуры");
    task.task_1(name);
    System.out.println("4: Добавить в конец исходного файла текст, введённый с клавиатуры");
    task.task_4(name);
    System.out.println("Result");
    task.task_2(name);
  }
}