package Tests;

import Classes.Ball;

public class BallTest {
  public BallTest() {
    Ball b1 = new Ball(100, 100);
    System.out.println(b1);
    b1.Move(30, 15);
    System.out.println(b1);
    System.out.println("test passed");
  }
}