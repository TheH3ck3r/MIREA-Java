public class HumanTest {
  HumanTest() {
    Head head = new Head();
    Leg leg = new Leg();
    Hand hand = new Hand();

    Human human = new Human(head, leg, hand);
    System.out.println(human);
  }
}