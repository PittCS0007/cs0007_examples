import java.io.*;
import java.util.Scanner;

public class FileDemo {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Enter a file name: ");
    String fileName = keyboardInput.nextLine();

    copyFile(fileName);
  }

  public static void copyFile(String fname) throws FileNotFoundException {
    File fileToRead = new File(fname);
    Scanner fileInput = new Scanner(fileToRead);

    File fileToWrite = new File("copyOf" + fname);
    PrintWriter fileOutput = new PrintWriter(fileToWrite);

    System.out.println("Coping file: " + fname);
    while (fileInput.hasNextLine()) {
      String fromFile = fileInput.nextLine();
      fileOutput.println(fromFile);
    }
    System.out.println("EOF");
    
    fileInput.close();
    fileOutput.close();
  }
}
