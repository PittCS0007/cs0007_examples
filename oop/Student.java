import java.util.ArrayList;

public class Student extends Person {
  private ArrayList<String> courses;

  public Student(String name) {
    super(name);
    this.courses = new ArrayList<String>();
  }

  public void addCourse(String newCourse) {
    this.courses.add(newCourse);
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Courses: " + this.courses);
  }
}
