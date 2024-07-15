public class RegularCard extends Card {
  private int value;

  public RegularCard(String suit, int value) {
    super(suit);
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value + this.suit;
  }

  @Override
  public int getValue() {
    return this.value;
  }
}
