/******************
Aditya Tikhe
Period 7
Lab 2
Due Date: Nov. 11
Date Submitted: Nov. 11
What I learned: 
   a. Introduced to classes, objects, constructors and how to use them. 
  
Purpose: The purpose of this program is to create a Student class and create
         two student objects.
******************/
public class Student
{
   private String name;
   private double gpa;
   private int studentNumber;

   public Student(String name, double gpa, int studentNumber)
   {
      this.name = name;
      this.gpa = gpa;
      this.studentNumber = studentNumber;
   }

   public String getName()
   {
      return name;
   }
   
   public double getGPA()
   {
      return gpa;
   }
   
   public int getStudentNumber()
   {
      return studentNumber;
   }
   public String toString(){
      return " Name: " + name + "\n GPA: " + gpa + "\n Student Number: " + studentNumber;
   }
   
   public static void main (String [] args)
   {
      Student Aditya = new Student("Aditya Tikhe", 4.0, 444444);
      Student Troy = new Student("Troy", 3.99, 111111);
      System.out.println(Aditya); 
      System.out.println();
      System.out.println(Troy);     
   }
}
/*
  Name: Aditya Tikhe
  GPA: 4.0
  Student Number: 444444
 
  Name: Troy
  GPA: 3.99
  Student Number: 111111
*/