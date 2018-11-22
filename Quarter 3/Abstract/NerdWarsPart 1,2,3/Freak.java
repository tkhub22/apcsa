public class Freak extends Warrior
{

   public Freak (String name, char socialClique)
   {
      super(name, socialClique);
   }
   
   public void generateStats()
   {
      setIq(calcRandom(60,180));
      setStrength(calcRandom(1,100));
   }
}