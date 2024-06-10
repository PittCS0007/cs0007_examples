import java.util.Scanner;

public class Squaring {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a number, -1 to stop: ");
    int fromUser = keyboard.nextInt();

    while (fromUser != -1) {
      int currentSquare = fromUser * fromUser;
      System.out.println(fromUser + " squared is " + currentSquare);

      System.out.print("Enter another nunmber, -1 to stop: ");
      fromUser = keyboard.nextInt();
    }
  }
}
