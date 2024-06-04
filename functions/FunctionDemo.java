public class FunctionDemo {
  public static void main(String[] args) {
    printer("About to call a function...");
    a_function();
    a_function();
    a_function();
    printer("Called a function!");
  }

  public static void a_function() {
    printer("Inside the function");
  }

  public static String emphasizer(String to_emphasize) {
    String emphasized = to_emphasize + "?";
    return emphasized;
  }

  public static void printer(String a_string) {
    String emphasized_string = emphasizer(a_string);
    System.out.println(emphasized_string);
  }
}
