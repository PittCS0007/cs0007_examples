public class FaceCard extends Card {
  private String value;

  public FaceCard(String suit, String value) {
    super(suit);
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value + this.suit;
  }

  @Override
  public int getValue() {
    if (this.value.equals("A")) {
      return 11;
    }
    else {
      return 10;
    }
  }

  @Override
  public boolean isAce() {
    if (this.value.equals("A")) {
      return true;
    }
    else {
      return false;
    }
  }
}
