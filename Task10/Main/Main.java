public class Main {
  public static void main(String[] args) {
    var rec = new Recursions();
    System.out.println("<-- GetTriangleSequence -->");
    System.out.println(rec.GetTriangleSequence(10));
    System.out.println("\n<-- FromOneToN -->");
    System.out.println(rec.FromOneToN(15));
    System.out.println("\n<-- FromAToB -->");
    System.out.println(rec.FromAToB(100, 110));
    System.out.println("\n<-- CountElementsEqualsMax -->");
    rec.CountElementsEqualsMax(5, 5);
    System.out.println("\n<-- MaxSequence -->");
    System.out.println(rec.MaxSequence());
  }
}