import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Before the loop");

    while (true) {
      System.out.print("Enter a number, -1 to stop: ");
      int fromUser = keyboard.nextInt();

      if (fromUser == -1) {
        break;
      }
      
      int currentSquare = fromUser * fromUser;
      System.out.println(fromUser + " squared is " + currentSquare);
    }

    System.out.println("After the loop");
  }
}
