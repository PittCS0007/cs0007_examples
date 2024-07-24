import java.io.*;
import java.util.Scanner;

public class DivideAll {
  public static void main(String[] args) {
    try {
      File fileToRead = new File(args[0]);
      Scanner fileInput = new Scanner(fileToRead);

      try{
        while (fileInput.hasNextInt()) {
          int a = fileInput.nextInt();
          int b = fileInput.nextInt();

          System.out.println(a + "/" + b + " == " + a/b);
        }
      }
      catch (ArithmeticException exp) {
        System.out.println("Can't divide by 0!");
      }
      finally {
        fileInput.close();
      }
    }
    catch (FileNotFoundException exp) {
      System.out.println("Couldn't find that file! Can't copy the file");
    }
  }
}
