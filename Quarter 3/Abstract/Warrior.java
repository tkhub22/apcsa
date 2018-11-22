/*
Aditya Tikhe
Period 7
Due Date: 2/9
Date Submitted: 2/9
Not fully correct
What I learned: 
            a. How to work with an abstract class and child classes
*/
public abstract class Warrior
{
   private boolean alive = true;
   private String name;
   public int iq;
   public int strength; 
   private char socialClique;
   
   public Warrior (String name, char socialClique)
   {
      this.name = name;
      this.socialClique = socialClique;
      generateStats();
   }
   
   public int calcRandom (int small, int large)
   {
      return (int)(Math.random()*(large - small + 1) + small); 
   }
   
   
   public int getIq()
   {
      return iq;
   }
   public void setIq(int i)
   {
      iq = i; 
   }
   public int getStrength()
   {
      return strength;
   }
   public void setStrength(int s)
   {
      strength = s;
   }
   public String getName()
   {
      return name;
   }
   public void setName(String n)
   {
      name = n;
   }
   
   public boolean getAlive()
   {
      return alive;
   }
   
   public void setAlive (boolean alive)
   {
      alive = true;
   }
   
   
   public abstract void generateStats();

   public boolean equals (Warrior other)
   {
      return (this.iq == other.iq && this.strength == other.strength);
   }
   public String toString ()
   {
      return "Name: " + name + " Clique: " + socialClique + " IQ: " + iq + " Strength: " + strength;  
   }
   
   public void fight (Warrior other)
   {
   
   if (this.getIq() - other.getIq() >= 20)
            System.out.println(this.getName() + " wins by IQ.");

   else if (other.getIq() - this.getIq() >= 20)
         System.out.println(other.getName() + " wins by IQ.");
         
   else if (other.getStrength() > this.getStrength())
         System.out.println(other.getName() + " wins by strength.");
         
   else
               System.out.println(this.getName() + " wins by strength.");
        
     }
}


