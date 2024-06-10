import java.util.Scanner;

public class StringSentinel {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a string, \"stop\" to stop: ");
    String fromUser = keyboard.nextLine();

    while (!fromUser.equals("stop")) {
      System.out.println(fromUser + "!");

      System.out.print("Enter another string, \"stop\" to stop: ");
      fromUser = keyboard.nextLine();
    }
  }
}
