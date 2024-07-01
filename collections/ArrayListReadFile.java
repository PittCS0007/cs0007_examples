import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ReadFile {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Create an ArrayList
    ArrayList<String> fileLines = new ArrayList<String>();

    // Count lines in the file
    String currentLine = "";
    while (inputFile.hasNextLine()) {
      currentLine = inputFile.nextLine();
      fileLines.add(currentLine);
    }

    inputFile.close();

    System.out.println("Here is the item at index 3: " + fileLines.get(3));
    System.out.println("There are " + fileLines.size() + " line in the ArrayList");

    if (fileLines.contains("this")) {
      System.out.println("'this' was in the file!");
    }
    else {
      System.out.print("'this' was not in the file!");
    }

    // Output each line to the terminal
    System.out.println("Here are the lines of the file:");
    for (String line : fileLines) {
      System.out.println(line);
    }
  }
}
