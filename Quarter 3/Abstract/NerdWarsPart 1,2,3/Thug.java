public class Thug extends Warrior
{
   public Thug (String name, char socialClique)
   {
      super(name, socialClique);
      
   }
   public void generateStats()
   {
      iq = calcRandom(60,90);
      strength = calcRandom(80,100);
   }
}