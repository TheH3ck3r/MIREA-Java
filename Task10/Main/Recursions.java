import java.nio.charset.StandardCharsets;

public class Recursions {

  // Задание 1
  public String GetTriangleSequence(int n) {
    int sum = 0;
    int j = 0;

    if (1 == n) {
      System.out.print("1");
    } else {
      for (int i = 1; sum < n; i++) {
        sum += i;
        j = i;
      }
      --n;
      System.out.print(GetTriangleSequence(n) + " " + j);
    }
    return "";
  }

  // Задание 2
  public String FromOneToN(final int n) {
    if (1 == n) {
      return "1";
    }

    return this.FromOneToN(n - 1) + " " + n;
  }

  // Задание 3
  public static String FromAToB(final int a, final int b) {

    if (a > b) {

      if (a == b) {
        return Integer.toString(a);
      }

      return a + " " + Recursions.FromAToB(a - 1, b);
    } else {

      if (a == b) {
        return Integer.toString(a);
      }

      return a + " " + Recursions.FromAToB(a + 1, b);
    }
  }

  // Задание 16
  public void CountElementsEqualsMax(int max, int count) {

    java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);

    int n = in.nextInt();

    if (n > 0) {

      if (n > max) {
        CountElementsEqualsMax(n, 1);
      } else if (n == max) {
        CountElementsEqualsMax(max, ++count);
      } else {
        CountElementsEqualsMax(max, count);
      }
    } else {
      System.out.println("Большее число: " + count);
    }
  }

  // Задание 17
  public static int MaxSequence() {
    java.util.Scanner in = new java.util.Scanner(System.in, StandardCharsets.UTF_8);
    int n = in.nextInt();
    if (n == 0) {
      return 0;
    } else {
      return Math.max(n, MaxSequence());
    }
  }
}