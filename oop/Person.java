public class Person {
  private String name;
  private int age;
  private String gender;
  private static String favoriteLanguage = "Java";

  public Person() {
    this.name = null;
    this.age = 0;
    this.gender = null;
  }

  public Person(String name) {
    this.name = name;
    this.age = 20;
    this.gender = "PreferNotToSay";
  }
  
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void display() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Favorite language: " + this.favoriteLanguage);
  }

  public void display(String extraMessage) {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Favorite language: " + this.favoriteLanguage);
    System.out.println("Extra string message: " + extraMessage);
  }
  
  public void display(int extraNumber) {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Favorite language: " + this.favoriteLanguage);
    System.out.println("Extra int message: " + extraNumber);
  }

  public void setFavorite(String fav) {
    this.favoriteLanguage = fav;
  }

  public void happyBirthday() {
    this.age += 1;
  }

  public int getAge() {
    return this.age;
  }

  public void setGender(String g) {
    this.gender = g;
  }

  public String getGender() {
    return this.gender;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return this.name;
  }

  public static boolean lovesJava() {
    return true;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
