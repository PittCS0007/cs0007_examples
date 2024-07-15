import java.util.ArrayList;

public class CompositionStudent {
  Person person;
  private ArrayList<String> courses;

  public CompositionStudent(String name) {
    this.person = new Person(name);
    this.courses = new ArrayList<String>();
  }

  public void happyBirthday() {
    this.person.happyBirthday();
  }

  public void addCourse(String newCourse) {
    this.courses.add(newCourse);
  }

  public void display() {
    this.person.display();
    System.out.println("Courses: " + this.courses);
  }
}
