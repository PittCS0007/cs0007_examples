import java.util.Scanner;

public class OneToX {
  public static void main(String[] args) {
    // get a number from the user between 5 and 10
    Scanner input = new Scanner(System.in);
    int fromUser = getInput(input);

    // print numbers from 1 to fromUser
    printTo(1, fromUser);
  }

  public static void printTo(int from, int to) {
    if (from <= to) {
      System.out.println(from);
      printTo(from+1, to);
    }
    // otherwise do nothing in base case
  }

  public static int getInput(Scanner keyboard) {
    // read a number from the user
    System.out.print("Enter a number: ");
    int fromUser = keyboard.nextInt();

    // check if its valid
    if (fromUser >= 5 && fromUser <= 10) {
      return fromUser;
    }
    else {
      System.out.println("Number must be between 5 and 10");
      return getInput(keyboard);
    }
  }
}
