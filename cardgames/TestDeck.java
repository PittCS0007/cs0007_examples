public class TestDeck {
  public static void main(String[] args) {
    Deck d = new Deck();
    System.out.println(d);

    d.shuffle();
    System.out.println(d);

    Card c = d.draw();
    System.out.println(c);
    System.out.println(d);

    d.shuffle(); 
    System.out.println(d);
  }
}
