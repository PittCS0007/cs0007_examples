public class Increment {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    // v From the slides v
    //int result1 = ++x + y;
    //int result2 = x + y++;

    x += 1;
    int result1 = x + y;
    int result2 = x + y;
    y += 1;

    System.out.println("x: " + x);
    System.out.println("y: " + y);
    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
  }
}
