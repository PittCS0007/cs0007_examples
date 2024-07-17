import java.util.ArrayList;

public class PrintAll {
  public static void main(String[] args) {
    ArrayList<Integer> toPrint = new ArrayList<Integer>();

    toPrint.add(5);
    toPrint.add(50);
    toPrint.add(10);
    toPrint.add(1);
    toPrint.add(100);

    printAll(toPrint);
  }

  public static void printAll(ArrayList<Integer> l) {
    if (l.size() == 0) {
      return;
    }

    System.out.println(l.remove(0));

    printAll(l);
  }
}
