public class ArrayAssignment {
  public static void main(String[] args) {
    int[] a = {5, 6, 7, 8};
    int[] b = a;
    int[] c = b;
    c[1] = 10;

    printArray(a, "a");
    printArray(b, "b");
    printArray(c, "c");

    int[] d = {9, 10, 11, 12};
    printArray(d, "d");
  }

  public static void printArray(int[] arr, String name) {
    System.out.println("Array " + name + ": " + arr);
    for(int cur : arr) {
      System.out.println(cur);
    }
  }
}
