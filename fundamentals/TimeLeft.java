import java.util.Scanner;

public class TimeLeft {
  public static void main(String[] args) {
    final int MINUTES_PER_HOUR = 60;
    Scanner input = new Scanner(System.in);
    // Get distance left to travel in miles
    System.out.print("Enter distance left in whole miles: ");
    int distance = input.nextInt();
    double fractionalDistance = distance * 1.0;
    // Get speed in mph
    System.out.print("Enter the current speed in whole miles per hour: ");
    double speed = input.nextInt() * 1.0;
    // Divide distance by speed
    double hoursLeft = distance / speed;
    int minutesLeft = (int) ((hoursLeft % 1.0) * MINUTES_PER_HOUR);
    int hoursLeftAsInt = (int) hoursLeft;
    // Report result of division
    System.out.println("Time left: " + hoursLeftAsInt + " hours and " + minutesLeft + " minutes");
  }
}
