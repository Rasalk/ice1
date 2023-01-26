package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Rasal Kareem Jan 25, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       
        Card randomcard = new Card();
        
        Card[] hand = new Card[7];
       
       
        for (int i = 0; i < hand.length; i++)
        {
            randomcard.setValue((int)(1+Math.random()*13));
            
            randomcard.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            hand[i] = randomcard;
            System.out.println(hand[i].getValue()+" "+hand[i].getSuit());
        }
        
        Card InputCard = new Card();
        Scanner Firstval = new Scanner(System.in);
        System.out.println("Enter a number from 1-13(11 for Jack,12 for Queen, 13 for King) : ");
        InputCard.setValue(Firstval.nextInt());
        
        Scanner Secondval = new Scanner(System.in);
        System.out.println("Enter a for Card Suit (1 Hearts,2 Diamonds,3 Spades,4 Clubs) : ");
        InputCard.setSuit(Card.SUITS[(in.nextInt()-1)]);
        
        System.out.println(InputCard.getValue()+ " " +InputCard.getSuit());//To print the user card
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        
        boolean value = false;
        for(int i = 0; i< hand.length; i++)
        {
            if(InputCard.getValue()== hand[i].getValue() && InputCard.getSuit()== hand[i].getSuit()){
                value = true;
            }
            else continue;
        }
        
        if(value)
        {
            System.out.println("Hurray! A Match has been Recorded");
            printInfo();

        }
        else{
            System.out.println("The number you Chose is not in the pack ");
        }

        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Rasal Kareem");
        System.out.println();
        
        System.out.println("My career ambitions: To be a Great Programmer");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Football");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Music");
        System.out.println("-- Riding Vehicles");

        System.out.println();
        
    
    }

}
