package chap_07;

public class Listing_7_02_DeckOfCards {

  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Club"};
    String[] ranks = {"Ace", "2", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    // Initialize the cards
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }
    
    // Display the first four cards
    for (int i = 0; i < 10; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
    }
  }

}
