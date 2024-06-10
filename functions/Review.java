import java.util.Scanner;

public class Review {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int fromUser = input.nextInt();

    System.out.println("Function returned: " + addOne(fromUser);
  }

  public static int addOne(int toIncrement) {
    return toIncrement + 1;
  }
}
