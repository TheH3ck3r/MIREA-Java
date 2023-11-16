import Dish.Cup;
import Dish.Dish;
import Dish.Plate;
import Dog.Bulldog;
import Dog.Dog;
import Dog.Poodle;

public class Main {
  public static void main(String[] args) {

    System.out.println("\n<--Dish test-->");
    Dish cup = new Cup("Ceramic", 250, true);
    cup.use();
    cup.wash();

    Dish plate = new Plate("Porcelain", 500, true);
    plate.use();
    plate.wash();

    System.out.println("\n<--Dog test-->");
    Dog bulldog = new Bulldog(5);
    bulldog.bark();
    bulldog.sleep();

    Dog poodle = new Poodle(3);
    poodle.bark();
    poodle.sleep();

    System.out.println("\n<--Furniture test-->");
    Furniture chair = new Chair("Wooden", 10, true);
    chair.sit();
    chair.move();
    Furniture table = new Table("Glass", 20, 4);
    table.sit();
    table.move();

    FurnitureShop furnitureShop = new FurnitureShop("My Furniture Shop");
    furnitureShop.sell(chair);
    furnitureShop.sell(table);
  }
}