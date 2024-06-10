public class Countdown {
  public static void main(String[] args) {
    a(5);
    main();
  }

  public static void a(int num) {
    if (num > 0) {
      System.out.println("Hello from scope with num == " + num);
      a(num - 1);
    }
  }
}
