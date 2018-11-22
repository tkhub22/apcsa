/*
Aditya Tikhe
Period 7
Due Date: 2/9
Date Submitted: 2/9
What I learned: 
            a.
*/
public abstract class Warrior
{
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
   
   
   public void generateStats()
   {
      if (socialClique == 'N')
      {
         iq = calcRandom(120,180);
         strength = calcRandom(20,80);
      }
      if (socialClique == 'J')
      {
         iq = calcRandom(80,140);
         strength = calcRandom(50,100);
      }
      if (socialClique == 'P')
      {
         iq = calcRandom(90,150);
         strength = calcRandom(40,90);
      }
      if (socialClique == 'T')
      {
         iq = calcRandom(60,90);
         strength = calcRandom(80,100);
      }
      if (socialClique == 'F')
      {
         iq = calcRandom(60,180);
         strength = calcRandom(1,100);
      }         
   }
   
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


