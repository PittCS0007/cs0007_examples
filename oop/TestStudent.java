public class TestStudent {
  public static void main(String[] args) {
    Student f = new Student("Fran");

    f.addCourse("CS0007");

    f.display();

    System.out.println("Printing f: " + f);

    CompositionStudent g = new CompositionStudent("Gary");

    g.addCourse("CS0007");
    g.happyBirthday();
    g.display();
  }
}
