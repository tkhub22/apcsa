/*
Name: Aditya Tikhe
Period: 7
Due date: Jan 27                        
Date submitted: Jan 25
What I learned:
   a. In this lab, I learned how to call different methods from an array list.
   b. I also worked with for loops to cycle through the whole array.
   c. I modified and shuffled the elements of the array.
What I think of this lab: 
   I think this lab is useful because it is a good introduction to the methods
   that arrat lists use.
*/
import java.util.*;
public class StandardDeck
{

   ArrayList<Card> deck = new ArrayList<Card>(52);

	/*Pre-condition: none
	 *Post-condition: An ArrayList of objects of type Card will be created
	*/
   public StandardDeck()
   {
      buildDeck();   
   }

	/*Pre-condition: none
	 *Post-condition: A new ArrayList of cards will be created with 52 cards.  
	 *There will be 4 suits with 13 cards each.
	*/
   public void buildDeck()
   {
   
      for(int i = 0; i <4; i++)
      {
         for(int j =0; j<13; j++)
         {
            Card card = new Card(j,i);
            deck.add(card);
         }
      }
   } 
   public void clearDeck()
   {
   
      for(int i = 0; i< deck.size();)
      {
         deck.remove(i);
      }
   }

	/*Pre-condition: none
	 *Post-condition: The first card in the ArrayList of cards will be removed and
	 *it will also actually be returned
	*/
   public Card removeFirstCard()
   {
      return deck.remove(0);
   }
	
	
	/*Pre-condition: None.
	 *Post-condition: The ArrayList of cards will be randomly shuffled.
	*/ 
   //math.random generates a random number between 1-52 
   //then it switches that card with the card at the ith element.
   public void shuffleDeck()
   {
      for(int i = 0; i >= 52; i++)
      {
         int k = (int)(Math.random() * ( 52 - i) + i);
      }
   }

	/*Pre-condition: none
	 *Post-condition: The number of cards in the ArrayList deck will be returned.
	*/
   public int numberOfCards()
   {
      return deck.size();
   }

	/*Pre-condition: v >= 0 && v <= 12 AND s >= 0 && s<=3
	 *Post-condition: A new card will be added to the ArrayList deck if the card is
	 *not already present in the deck, but if there is already a similar card in the
	 *deck, nothing will happen.
	*/
   public void addCard(int v, int s)
   {
      Card newC = new Card(v,s);
      boolean exists = false;
      for (int i = 0; i < deck.size(); i++)
      {
         Card temp = deck.get(i);
         if(newC.equals(temp))
         {
            exists =true;
            break;
         }
      }
      if(!exists)
         deck.add(deck.size(), newC);
   }	

	/*Pre-condition: none
	 *Post-condition: The number of cards will be printed on the screen, as well as
	 *the details of each card(including its value and suit).
	*/
   public String toString()
   {
      return ("There are " + deck.size() + " cards.");
   }

	/*Pre-condition: none
	 *Post-condition: The ArrayList of cards will be reset so that there is one card of each
	 *suit and value. This new ArrayList will also be shuffled.
	*/
   public void reset()
   {
      clearDeck();
      System.out.println("ize of deck: " + deck.size());
      buildDeck();
      shuffleDeck();
   }
	
   //test standard deck
   public static void main(String [] args)
   {
   
      StandardDeck s = new StandardDeck();
   
      System.out.println ("Num of cards: " + s.numberOfCards());
   
      System.out.println("******** First card is: " + s.removeFirstCard()); 
   	
      System.out.println ("After removing the first card. Num of cards: " + s.numberOfCards());
      s.addCard(0, 0); 
      System.out.println ("After adding new Card (0,0). Size of deck: " + s.numberOfCards());
    
      System.out.println ("**************************************************************");
      s.shuffleDeck(); 
      System.out.println("After shuffling.  Num of cards: " +  s.numberOfCards()); 
      System.out.println("The shuffled deck:  =======================>");
      System.out.println(s); 
   	
      s.reset(); 
      System.out.println("The reset deck:  =======================>");
      System.out.println(s); 
      System.out.println("Number of cards AFTER reset: " + s.numberOfCards()); 	
   	
      Card c = new Card(12, 0);
      Hand h =new Hand();  
      Hand h2 = new Hand(c); 
      h.addCard(12, 3); // adding a card to h
      System.out.println(h.numberOfCards()); // should return 1
      System.out.println(h.getCard(0) + "\n" + h2.getCard(0)); // should return Ace of Spades and Ace of Clubs
      System.out.println(h.ifSameValue(12) + "\n" + h.ifSameSuit(3)); // true true
      System.out.println(h2.ifSameValue(3) + "\n" + h2.ifSameSuit(3)); // false false
      h.removeCard(0); // removes card
      System.out.println(h2); // tests toString method
   } // end of main
} // class
/*
 Num of cards: 52
 ******** First card is: 2 of Clubs
 After removing the first card. Num of cards: 51
 After adding new Card (0,0). Size of deck: 52
 **************************************************************
 After shuffling.  Num of cards: 52
 The shuffled deck:  =======================>
 There are 52 cards.
 ize of deck: 0
 The reset deck:  =======================>
 There are 52 cards.
 Number of cards AFTER reset: 52
 1
 Ace of Spades
 Ace of Clubs
 true
 true
 false
 false
 Ace of Clubs 
*/