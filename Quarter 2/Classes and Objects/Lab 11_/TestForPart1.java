public class TestForPart1
{
   public static void main (String [] args)
   {
      Warrior lau = new Warrior ("Lau", 'N');
      Warrior pete = new Warrior ("Peter", 'J');
      System.out.println(lau);
      System.out.println(pete);
      
      lau.fight(pete);
   }
}
/*
 Name: Lau Clique: N IQ: 173 Strength: 59
 Name: Peter Clique: J IQ: 91 Strength: 94
 Lau wins by IQ.
*/
/*
 Name: Lau Clique: N IQ: 135 Strength: 78
 Name: Peter Clique: J IQ: 135 Strength: 84
 Peter wins by strength.
*/
/*
 Name: Lau Clique: N IQ: 130 Strength: 74
 Name: Peter Clique: J IQ: 129 Strength: 65
 Lau wins by strength.
*/