import java.util.Scanner;

public class GradeCalc {
  public static int getGrade(String assignmentName, int total) {
    System.out.print("What is your " + assignmentName + " grade (out of " + total + ")? ");
    int grade = input.nextInt();
    return grade;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get Exams
    int exam1 = getGrade("Exam1", 100);
    int exam2 = getGrade("Exam2", 100);

    // Get Projects
    System.out.print("What is your Project1 grade (out of 100)? ");
    int project1 = input.nextInt();
    
    System.out.print("What is your Project2 grade (out of 100)? ");
    int project2 = input.nextInt();

    System.out.print("What is your Project3 grade (out of 100)? ");
    int project3 = input.nextInt();

    // Get Participation
    System.out.print("What is your Lecture Participation1 grade (out of 4)? ");
    int lecPart1 = input.nextInt();
    
    System.out.print("What is your Lecture Participation2 grade (out of 4)? ");
    int lecPart2 = input.nextInt();

    System.out.print("What is your Recitation Participation1 grade (out of 4)? ");
    int recPart1 = input.nextInt();
    
    System.out.print("What is your Recitation Participation2 grade (out of 4)? ");
    int recPart2 = input.nextInt();

    // Get Quizzes
    System.out.print("What is your average Quiz grade (out of 100)? ");
    int quizAvg = input.nextInt();

    // Compute total
    double exam_total = (exam1 / 100.0) + (exam2 / 100.0);
    exam_total = exam_total / 2.0;
    exam_total = exam_total * 40.0;
    //double total = ((exam1 + exam2)/200.0) * 40.0 + ((project1 + project2 + project3)/300.0) * 40.0 + lecPart1 + lecPart2 + recPart1 + recPart2 + (quizAvg/100.0) * 4;

    // Find letter grade
    String grade = "";
    if (total >= 97.0) {
      grade = "A+";
    }
    else if (total >= 94.0) {
      grade = "A";
    }
    else if (total >= 90.0) {
      grade = "A-";
    }
    else if (total >= 87.0) {
      grade = "B+";
    }
    else if (total >= 84.0) {
      grade = "B";
    }
    else if (total >= 80.0) {
      grade = "B-";
    }
    else if (total >= 77.0) {
      grade = "C+";
    }
    else if (total >= 74.0) {
      grade = "C";
    }
    else if (total >= 70.0) {
      grade = "C-";
    }
    else if (total >= 67.0) {
      grade = "D+";
    }
    else if (total >= 64.0) {
      grade = "D";
    }
    else if (total >= 60.0) {
      grade = "D-";
    }
    else {
      grade = "F";
    }

    // Print result
    System.out.println("Your overall grade is a " + grade + " (" + total + "%)");
  }
}
