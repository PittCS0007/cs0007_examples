import java.util.Scanner;

public class Continue {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Before the loop");

    while (true) {
      System.out.print("Enter an odd number, -1 to stop: ");
      int fromUser = keyboard.nextInt();

      if (fromUser == -1) {
        break;
      }

      if (fromUser % 2 == 0) {
        System.out.println("I only want to square odd numbers");
        continue;
      }
      
      int currentSquare = fromUser * fromUser;
      System.out.println(fromUser + " squared is " + currentSquare);
    }

    System.out.println("After the loop");
  }
}
