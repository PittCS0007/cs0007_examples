import java.util.*;
import java.io.*;

public class FindMostRepeated {
  public static void main(String[] args) throws FileNotFoundException {
    // Assume that we get the filename from the command line
    File fileToRead = new File(args[0]);
    Scanner inputFile = new Scanner(fileToRead);

    // Create an ArrayList
    HashMap<String, Integer> lineCounts = new HashMap<String, Integer>();

    // Count lines in the file
    String currentLine = "";
    while (inputFile.hasNextLine()) {
      currentLine = inputFile.nextLine();
      if (lineCounts.containsKey(currentLine)) {
        // Figure out current count for currentLine
        // int currentCount = lineCounts.get(currentLine);
        // // Add 1 on to that count
        // currentCount += 1;
        // // Store new count back in HashMap under currentLine key
        // lineCounts.put(currentLine, currentCount);

        // As a one-liner:
        lineCounts.put(currentLine, lineCounts.get(currentLine) + 1);
      }
      else {
        lineCounts.put(currentLine, 1);
      }
    }

    inputFile.close();

    String mostRepeatedWord = "";
    int mostRepeatedCount = 0;

    // Output each line to the terminal
    System.out.println("Here are the lines of the file:");
    for (Map.Entry<String, Integer> entry : lineCounts.entrySet()) {
      String line = entry.getKey();
      int count = entry.getValue();

      if (count > mostRepeatedCount) {
        mostRepeatedWord = line;
        mostRepeatedCount = count;
      }
      
      // System.out.println(line + " appeared " + count + " times");
    }

    System.out.println("The most repeated word was " + mostRepeatedWord + " which was found " + mostRepeatedCount + " times");
  }
}
