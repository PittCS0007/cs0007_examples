import java.util.*;

public class BlackJack {
  private static int HAND_SIZE = 2;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Deck deck = new Deck();
    deck.shuffle();

    BlackJackHand playerHand = new BlackJackHand();
    BlackJackHand dealerHand = new BlackJackHand();

    for (int i = 0; i < HAND_SIZE; i++) {
      playerHand.add(deck.draw());
      dealerHand.add(deck.draw());
    }

    System.out.println("Dealer hand: " + dealerHand);
    System.out.println();

    String answer = "";
    while (true) {
      System.out.println("Player hand: " + playerHand);
      
      if (playerHand.computeValue() > 21) {
        System.out.println("BUST!");
        break;
      }
      
      System.out.print("Would you like to hit (Y for yes)? ");
      answer = input.nextLine();

      if (!answer.equals("Y")) {
        break;
      }
      
      playerHand.add(deck.draw());
    }

    System.out.println();

    while (playerHand.computeValue() <= 21 && dealerHand.computeValue() < playerHand.computeValue() && dealerHand.computeValue() < 21) {
      dealerHand.add(deck.draw());
      System.out.println("Dealer hand: " + dealerHand);
    }

    System.out.println();

    if (playerHand.computeValue() > 21) {
      System.out.println("The dealer wins!");
    }
    else if (dealerHand.computeValue() > playerHand.computeValue()) {
      System.out.println("The dealer wins!");
    }
    else if (playerHand.computeValue() > dealerHand.computeValue()) {
      System.out.println("The player wins!");
    }
    else {
      System.out.println("Push!");
    }
  }

}
