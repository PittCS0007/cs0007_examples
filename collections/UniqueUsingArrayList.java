import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class UniqueUsingArrayList {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Create an ArrayList
    ArrayList<String> fileLines = new ArrayList<String>();

    // Count lines in the file
    while (inputFile.hasNextLine()) {
      fileLines.add(inputFile.nextLine());
    }

    inputFile.close();

    ArrayList<String> uniqueLines = new ArrayList<String>();

    // Output each line to the terminal
    System.out.println("Here are the lines of the file:");
    for (String line : fileLines) {
      if (!uniqueLines.contains(line)) {
        uniqueLines.add(line);
        System.out.println(line);
      }
    }
  }
}
