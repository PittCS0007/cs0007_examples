import java.util.Scanner;

public class StringComparisons {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String userEntered = input.nextLine();

    System.out.println("You entered: -" + userEntered + "-");

    String whatImLookingFor = "hybrid technology";

    if (whatImLookingFor == whatImLookingFor) {
      System.out.println("Sanity check passed");
    }
    else {
      System.out.println("Sanity check failed");
    }

    if (userEntered.equals("hybrid technology")) {
      System.out.println("matched!");
    }
    else {
      System.out.println("did not match :(");
    }
  }
}
