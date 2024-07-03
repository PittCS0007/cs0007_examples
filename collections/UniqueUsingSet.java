import java.util.Scanner;
import java.util.HashSet;
import java.io.*;

public class UniqueUsingSet {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Create an ArrayList
    HashSet<String> fileLines = new HashSet<String>();

    // Count lines in the file
    while (inputFile.hasNextLine()) {
      fileLines.add(inputFile.nextLine());
    }

    inputFile.close();

    // Output each line to the terminal
    System.out.println("Here are the lines of the file:");
    for (String line : fileLines) {
      System.out.println(line);
    }
  }
}
