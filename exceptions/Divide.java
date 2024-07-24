import java.util.Scanner;
import java.util.InputMismatchException;

public class Divide {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a numerator: ");
      int a = input.nextInt();

      System.out.print("Enter a denomenator: ");
      int b = input.nextInt();

      int c = a/b;
      System.out.println("Division: " + c);
    }
    catch (InputMismatchException exp) {
      System.out.println("You need to enter valid numbers!");
    }
    catch (ArithmeticException exp) {
      System.out.println("You can't divide by 0!");
    }
  }
}
