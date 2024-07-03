import java.util.Scanner;
import java.io.*;

public class TwoLoopReadFile {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Count lines in the file
    String currentLine = "";
    int lineCount = 0;
    while (inputFile.hasNextLine()) {
      lineCount += 1;
      currentLine = inputFile.nextLine();
    }

    inputFile.close();

    // Sanity check this is working
    // System.out.println("There are " + lineCount + " lines in the file!");

    // Create appropriately sized array
    String[] fileLines = new String[lineCount];

    inputFile = new Scanner(fileToRead);

    // Read contents from file
    lineCount = 0;
    while (inputFile.hasNextLine()) {
      fileLines[lineCount] = inputFile.nextLine();
      lineCount += 1;
    }

    inputFile.close();

    // Output each line to the terminal
    System.out.println("Here are the lines of the file:");
    for (String line : fileLines) {
      System.out.println(line);
    }
  }
}
