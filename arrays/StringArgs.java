public class StringArgs {
  public static void main(String[] args) {
    System.out.println("Length of args is: " + args.length);
    // regular for loop aka classic for loop aka C-style for loop:
    // for (int i = 0; i < args.length; i++) {
    //   System.out.println(args[i]);
    // }
    // Enhanced for loop:
    for (String cur : args) {
      System.out.println(cur);
    }
  }
}
