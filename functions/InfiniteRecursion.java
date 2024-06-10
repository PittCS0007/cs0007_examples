public class InfiniteRecursion {
  public static void main(String[] args) {
    foo();
  }

  public static void foo() {
    System.out.println("Hello");
    foo();
  }
}
