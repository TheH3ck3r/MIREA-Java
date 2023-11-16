import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Recursions {

  // Задание 7
  public void Factorization(final int n, int k) {

    if (k > n / 2) {
      System.out.println(n);
      return;
    }

    if (0 == n % k) {
      System.out.println(k);
      this.Factorization(n / k, k);
    } else {
      ++k;
      this.Factorization(n, k);
    }
  }

  // Задание 8
  public String Palindrom(final String s) {
    if (1 == s.length()) {
      return "YES";
    } else {
      if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
        if (2 == s.length()) {
          return "YES";
        }
        return this.Palindrom(s.substring(1, s.length() - 1));
      } else {
        return "NO";
      }
    }
  }

  // Задание 9
  public int WithoutTwoZero(final int a, final int b) {
    if (a > b + 1) {
      return 0;
    }
    if (0 == a || 0 == b) {
      return 1;
    }
    return this.WithoutTwoZero(a, b - 1) + this.WithoutTwoZero(a - 1, b - 1);
  }

  // Задание 10
  public int Reverse(final int n, final int i) {
    return (0 == n) ? i : this.Reverse(n / 10, i * 10 + n % 10);
  }

  // Задание 11
  public static int CountOne() {
    final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    final int n = in.nextInt();

    if (1 == n) {
      final int m = in.nextInt();
      if (1 == m) {
        return Recursions.CountOne() + 1 + 1;
      } else {
        final int k = in.nextInt();
        if (1 == k) {
          return Recursions.CountOne() + n + m + 1;
        } else {
          return n + m + k;
        }
      }
    } else {
      final int m = in.nextInt();
      if (1 == m) {
        return Recursions.CountOne() + n + 1;
      } else {
        return n + m;
      }
    }
  }
}
