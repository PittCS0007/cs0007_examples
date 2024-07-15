import java.util.ArrayList;

public class BlackJackHand {
  private ArrayList<Card> hand;

  public BlackJackHand() {
    this.hand = new ArrayList<Card>();
  }

  public void add(Card newCard) {
    this.hand.add(newCard);
  }

  public int computeValue() {
    // System.out.println("Starting computeValue()");
    
    int total = 0;
    int aceCount = 0;
    
    for (Card c : this.hand) {
      // System.out.println("\tCurrent card: " + c);
      total += c.getValue();
      // System.out.println("\tisAce()?: " + c.isAce());
      if (c.isAce()) {
        aceCount += 1;
      }
    }

    // System.out.println("\tInitial total: " + total);
    // System.out.println("\tAce count: " + aceCount);

    while (total > 21 && aceCount > 0) {
      total -= 10;
      aceCount -= 1;
    }

    // System.out.println("\tFinal total: " + total);
    // System.out.println("Ending computeValue()");

    return total;
  }

  @Override
  public String toString() {
    return this.computeValue() + ": " + this.hand.toString();
  }
}
