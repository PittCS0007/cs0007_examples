import java.util.Scanner;

public class BuildArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How big of an array should I make? ");
    int arrayLength = input.nextInt();

    int[] myArray = new int[arrayLength];

    for (int i = 0; i < myArray.length; i++) {
      System.out.print("What number should I add to the array? ");
      myArray[i] = input.nextInt();
    }

    System.out.println("Here is the array:");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }
  }
}
