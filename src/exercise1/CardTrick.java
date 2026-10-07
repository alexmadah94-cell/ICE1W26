package exercise1;
import java.util.Random; 
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Alex-ryan Madah saha, oct 6,2026 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);                 
            card.setSuit(Card.SUITS[random.nextInt(4)]);            
            hand[i] = card;
        }

        
        System.out.println("Hand:");
        for (Card c : hand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Pick a card value (1-13, 11=Jack, 12=Queen, 13=King): ");
        int value = input.nextInt();
        System.out.print("Pick a suit (1=Hearts, 2=Diamonds, 3=Spades, 4=Clubs): ");
        int suitIndex = input.nextInt() - 1;                        

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitIndex]);

        boolean found = false;
        for (Card c : hand) {
            if (c.getValue() == userCard.getValue()
                    && c.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Alex-ryan madah saha, oct 6, 2026
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Alex-ryan, but you can call me Alex");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- enjoy what i'm doing");
        System.out.println("-- be consistant and prod of my work");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Soccer");
        System.out.println("-- Showping");
        System.out.println("-- Nextflix");
        System.out.println("-- Gym");

        System.out.println();
        
    
    }

}
