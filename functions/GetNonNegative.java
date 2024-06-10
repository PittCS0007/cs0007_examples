import java.util.Scanner;

public class GetNonNegative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int fromUser = gnn(input);
    System.out.println("You entered: " + fromUser);
  }

  public static int gnn(Scanner input) {
    System.out.print("Enter a non-negative number: ");
    int fromUser = input.nextInt();

    if (fromUser < 0) {
      return gnn(input);
    }
    
    return fromUser;
  }
}
