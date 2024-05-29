import java.util.Scanner;

public class MultiInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String enteredString = input.nextLine();

    System.out.print("Enter an integer: ");
    int enteredInt = input.nextInt();

    // if int > 10 and string is "red", print "foo"
    // if int < 5 and string is "blue", print "bar"
    // otherwise, print "nothing"

    /*
    // operator overview
    (1 + 1) == 2
    (true && true) == true
    (true && false) == false
    (false && true) == false
    (false && false) == false
    */

    if (enteredInt > 10 && enteredString.equals("red")) {
      System.out.println("foo");
    }
    else if (enteredInt < 5 && enteredString.equals("blue")) {
      System.out.println("bar");
    }
    else {
      System.out.println("nothing");
    }

    /*
    // Attempt1, a bit confusing 
    if (enteredInt > 10) {
      if (enteredString.equals("red")) {
        System.out.println("foo");
      }
      else {
        System.out.println("nothing");
      }
    }
    
    else if (enteredInt < 5) {
      if (enteredString.equals("blue")) {
        System.out.println("bar");
      }
      else {
        System.out.println("nothing");
      }
    }

    else {
      System.out.println("nothing");
    }
    */

  }
}
