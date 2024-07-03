import java.util.Scanner;
import java.io.*;

public class ResizingReadFile {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Create appropriately sized array
    int guessSize = 10;
    String[] fileLines = new String[guessSize];

    // Count lines in the file
    String currentLine = "";
    int lineCount = 0;
    while (inputFile.hasNextLine()) {
      // check if we need to resize
      if (lineCount >= fileLines.length) {
        guessSize *= 2;
        fileLines = resize(guessSize, fileLines);
      }
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

  public static String[] resize(int newSize, String[] oldArray) {
    System.out.println("Need to resize! new size: " + newSize);
    String[] newArray = new String[newSize];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }
    return newArray;
  }
}
