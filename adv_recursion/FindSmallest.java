import java.util.ArrayList;

public class FindSmallest {
  public static void main(String[] args) {
    ArrayList<Integer> toSearch = new ArrayList<Integer>();

    toSearch.add(10);
    toSearch.add(2);
    toSearch.add(15);
    toSearch.add(20);
    toSearch.add(7);
    toSearch.add(1);

    System.out.println("The smallest item is: " + findSmallestWithoutDestroy(toSearch));

    System.out.println(toSearch);
  }

  public static int findSmallestWithoutDestroy(ArrayList<Integer> l) {
    return findSmallestWDRec(l, 0, l.get(0));
  }

  public static int findSmallestWDRec(ArrayList<Integer> l, int curIndex, int leastSoFar) {
    if (curIndex >= l.size()) {
      return leastSoFar;
    }

    int next = l.get(curIndex);
    if (next < leastSoFar) { 
      return findSmallestWDRec(l, curIndex + 1, next);
    }
    else {
      return findSmallestWDRec(l, curIndex + 1, leastSoFar);
    }
  }

  public static int findSmallest(ArrayList<Integer> l) {
    return findSmallestRec(l, l.get(0));
  }

  public static int findSmallestRec(ArrayList<Integer> l, int leastSoFar) {
    if (l.size() == 0) {
      // base case
      return leastSoFar;
    }

    // recursive case
    int next = l.remove(0);

    if (next < leastSoFar) {
      return findSmallestRec(l, next);
    }
    else {
      return findSmallestRec(l, leastSoFar);
    }
  }
}
