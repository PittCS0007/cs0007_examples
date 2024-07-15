public class TestPerson {
  public static void main(String[] args) {
    Person a = new Person("Alice", 20, "F");
    a.display();

    Person b = new Person("Bob", 20, "M");
    b.display();

    b.setFavorite("Python");
    b.display();
    a.display();

    System.out.println("Alice's age is: " + a.getAge());
    a.happyBirthday();
    System.out.println("Alice's age is now: " + a.getAge());
    a.display();

    System.out.println("Alice: " + a.lovesJava());
    System.out.println("Bob: " + b.lovesJava());
    System.out.println("All people: " + Person.lovesJava());

    // Will not compile because .display() is not a static method
    // Person.display();

    Person d = new Person("Danielle");
    d.display();

    d.display("Overloadded!");

    d.display(1);

    Person h = new Person();
    String hName =  h.getName();
    if (hName == null) {
      System.out.println("h does not have a name");
    }
    else {
      System.out.println("h's name is " + hName.length() + " characters long");
    }

    // Person i = null;
    // i.display();
  }
}
