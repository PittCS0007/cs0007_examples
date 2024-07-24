public class Throwing {
  public static void main(String[] args) {
    try {
      System.out.println(addPositives(1, 2));
      System.out.println(addPositives(-1, 2));
      System.out.println(addPositives(1, -2));
      System.out.println(addPositives(4, 3));
      System.out.println(addPositives(10, 12));
    }
    catch (IllegalArgumentException exp) {
      System.out.println("Invalid argument passed to addPositives: " + exp.getMessage());
    }
  }

  public static int addPositives(int a, int b) {
    if (a < 0) {
      throw new IllegalArgumentException("A was negative");
    }

    if (b < 0) {
      throw new IllegalArgumentException("B was negative");
    }
    
    return a + b;
  }
}
