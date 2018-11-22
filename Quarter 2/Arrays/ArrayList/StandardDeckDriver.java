public class StandardDeckDriver
{
   public static void main (String [] args)
   {
      StandardDeck s = new StandardDeck();
      
      Card temp = s.removeFirstCard();
      s.shuffleDeck();
      System.out.println(s.numberOfCards());
      
      s.addCard(8,2); //this won't add a card
      System.out.println(s.numberOfCards()); //sees if same # of cards.
      s.addCard(temp.getValue(), temp.getSuit());
      System.out.println(s.numberOfCards()); //sees if added
      
      s.shuffleDeck();  
      System.out.println(s.toString());
      s.reset();   
   }
}
/*
 51
 51
 52
 There are 52 cards.
*/