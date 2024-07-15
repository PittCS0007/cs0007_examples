public class Card {
  protected String suit;

  public Card(String suit) {
    this.suit = suit;
  }

  public int getValue() {
    return -1;
  }

  public boolean isAce() {
    return false;
  }
}
