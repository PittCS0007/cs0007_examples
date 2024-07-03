import java.util.*;

public class AnotherHashMap {
  public static void main(String[] args) {
    HashMap<Integer, Character> anotherMap = new HashMap<Integer, Character>();

    anotherMap.put(5, 'c');
    anotherMap.put(3, 'n');
    anotherMap.put(7, 'q');
    anotherMap.put(8, 'p');
    anotherMap.put(217, 'z');

    for(Map.Entry<Integer, Character> entry : anotherMap.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}
