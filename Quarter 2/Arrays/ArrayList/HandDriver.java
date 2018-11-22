public class HandDriver
{
   public static void main (String[] args)
   {
      Hand h = new Hand();
      
      System.out.println(h.numberOfCards());
      
      h.addCard(3, 2);
      System.out.println("After adding a card there are: " + h.numberOfCards() + " left");
      h.addCard(1, 2);
      System.out.println("After adding a card there are: " + h.numberOfCards() + " left");
      h.addCard(6, 2);
      System.out.println("After adding a card there are: " + h.numberOfCards() + " left");
      h.addCard(7, 0);
      System.out.println("After adding a card there are: " + h.numberOfCards() + " left");
      
      Card temp = h.getCard(2);
      System.out.println(temp.toString());
      
      h.removeCard(0);
      System.out.println("After removing a card there are: " + h.numberOfCards() + " left");     
   }
}
/*
 0
 After adding a card there are: 1 left
 After adding a card there are: 2 left
 After adding a card there are: 3 left
 After adding a card there are: 4 left
 8 of Hearts
 After removing a card there are: 3 left
*/