import java.util.Scanner;

public class RightTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a triange height: ");
    int height = input.nextInt();

    // looping over each line
    for (int i = 1; i <= height; i++) {
      for (int j = 0; j < (height - i); j++) {
        System.out.print(' ');
      }
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
