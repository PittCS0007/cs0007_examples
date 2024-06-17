import java.util.Scanner;

public class OneToX {
  public static void main(String[] args) {
    // get a number from the user between 5 and 10
    Scanner input = new Scanner(System.in);
    int fromUser = 0;
    
    while (true) {
      System.out.print("Enter a number: ");
      fromUser = input.nextInt();

      if (fromUser >= 5 && fromUser <= 10) {
        break;
      }

      System.out.println("Must be a number between 5 and 10");
    }

    // print numbers from 1 to fromUser
    for (int myVar = 1; myVar <= fromUser; myVar++) {
      System.out.println(myVar);
    }
  }
}
