/******************
Aditya Tikhe
Period 7
Lab 11
Due Date: 12/2
Date Submitted: 12/2
Pre-condition: The test class and the Warrior class are in the same folder
Post-condition: - 
What I learned: 
            a. I practiced how to make classes and create instances of them from
               the test class.
            b. I reviewed how to make accessors and modifiers for each attribute.
            c. Reviewed how to call methods and write if conditions.
Purpose: The purpose of this lab is to simulate a game in which characters are
           put to fight. The one with the higher strength wins, unless the 
           character has an IQ 20 more than the other one. There are different
           social classes to which their strengths and IQs vary.
******************/
public class Warrior
{
   private String name;
   private int iq;
   private int strength; 
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


