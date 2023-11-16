public class Main {
  public static void main(String[] args) {
    var rec = new Recursions();

    System.out.println("\nEx №7; Factorization");
    rec.Factorization(330, 2);

    System.out.println("\nEx №8; Palindrom");
    System.out.println("Test 1 (tenet): " + rec.Palindrom("tenet"));
    System.out.println("Test 2 (cat): " + rec.Palindrom("cat"));

    System.out.println("\nEx №9 WithoutTwoZero");
    System.out.println("a = 2, b = 2: " + rec.WithoutTwoZero(2, 7));

    System.out.println("\nEx №10 Reverse");
    System.out.println("number = 12345: " + rec.Reverse(12345, 0));

    System.out.println("\nEx №11 CountOne");
    System.out.println(rec.CountOne());
  }
}