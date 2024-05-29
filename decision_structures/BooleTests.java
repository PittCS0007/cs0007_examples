import java.util.Scanner;

public class BooleTests {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an int: ");
    int userNumber = input.nextInt();

    if (userNumber < 10) {
      System.out.println("You entered a number less than 10!");
    }
    else if (userNumber > 10) {
      if (userNumber > 50) {
        System.out.println("You entered a number MUCH greater than 10");
      }
      else {
        System.out.println("You entered a number greater than 10!");
      }
    }
    else {
      System.out.println("You entered 10!");
    }
    System.out.println("This line is printed in all cases");
  }
}
