import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  private static String[] suits = {"H", "D", "C", "S"};
  private static String[] faces = {"J", "Q", "K", "A"};

  public Deck() {
    this.deck = new ArrayList<Card>();
    
    for (String suit : Deck.suits) {
      for (int i = 2; i <= 10; i++) {
        this.deck.add(new RegularCard(suit, i));
      }

      for (String face : Deck.faces) {
        this.deck.add(new FaceCard(suit, face));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(this.deck);
  }

  public Card draw() {
    return this.deck.remove(0);
  }

  @Override
  public String toString() {
    // String rv = "";
    // for (Card card : this.deck) {
    //   rv += card.toString() + ", ";
    // }
    // return rv;

    // Just reuse ArrayList's toString()!
    return this.deck.toString();
  }
}
