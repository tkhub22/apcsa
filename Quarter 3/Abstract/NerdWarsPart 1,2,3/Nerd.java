public class Nerd extends Warrior
{ 
   public Nerd (String name, char socialClique)
   {
      super(name, socialClique);
      
   }  
   
   public void generateStats()
   {
       iq = calcRandom(120,180);
       strength = calcRandom(20,80);
   }
}