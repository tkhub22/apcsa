public class Prep extends Warrior
{
   public Prep (String name, char socialClique)
   {
     super(name, socialClique);
   }
   public void generateStats()
   {
      iq = calcRandom(90,150);
      strength = calcRandom(40,90);
   }
}