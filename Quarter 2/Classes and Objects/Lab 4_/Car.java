/******************
Aditya Tikhe
Period 7
Lab 4
Due Date: 11/17
Date Submitted: 11/17
Pre-condition: the driver class is in the same folder.
Post-condition: - 
What I learned: 
   a.I learned how to practice with creating a class and making accessors and modifer methods.
   b.Making a driver class to test the class.
  
Purpose: The purpose of this program is to create a car class and give it various attributes.
         Then I would input values from the driver class to create an object from this class.
******************/
public class Car
{
   private String make;
   private int year;
   private double mileage;
   private double cost;
   
   public Car (String make, int year, double mileage, double cost)
   {
      this.make = make;
      this.year = year;
      this.mileage = mileage;
      this.cost = cost;
   }
   
   public String toString()
   {
      return " Make: " + make + "\n Year: " + year + "\n Mileage: " + mileage 
              + "\n Cost: " + cost;
   }
   
   public String getMake()
   {
      return this.make;
   }
   public void setMake(String make)
   {
      this.make = make;
   }
   
   public int getYear()
   {
      return this.year;
   }
   public void setYear(int year)
   {
      this.year = year;
   }
   
   public double getMileage()
   {
      return this.mileage;
   }
   public void setMileage( double mileage)
   {
      this.mileage = mileage;
   }

   public double getCost()
   {
      return this.cost;
   }
   public void setCost(double cost)
   {
      this.cost = cost;
   }
   public void testDrive (double miles)
   {
      mileage += miles; 
   }
}
 
