/*
Aditya Tikhe
Period 7
Lab 1
*/
public class OneDimLab
   {
   
      private int [] list;
      public OneDimLab (int [] array)
      {
         list = array;
      }
      // post condition: find and return the max element in list
      public int findMax()
      {
         return 0;
      }
      // post condition: find and return the index of the max element in list
      public int findMaxIndex()
      {
         return 0;
      }
   
      // post condition: find and return the min element in list
      public int findMin()
      {
         return 0;
      }
      // post condition: find and return the index of the min element in a
      public int findMinIndex()
      {
         return 0;
      }
   
      // post condition: check to see if target can be found in list or not.  If yes, returns
   //                             true; otherwise, returns false.
      public boolean find (int target)
      {
         return false;	
      }
   
      // post condition: put all the negative numbers in  an array and return it
      public int [] negArray ()
      {
         return null;
      }
   
      // post condition: put all the postivie numbers in list in an array and return the array
      public int [] posArray()
      {
         return null;
      }
   	
      // post condition: sum up all the numbers in list and return the sum
      public int sum ()
      {
         return 0;
      }
      // post condition: find the average of all the numbers in list 
      public double average()
      {
         return 0.0;
      }
   	
      // post condition: put all the even numbers in list and return the array
      public  int [] evenMembers()
      {
         return null;
      	
      }
   	
      // post condition: put all the odd numbers in list  and return the array	 
      public  int [] oddMembers()
      {
         return null;
      }
   	
      // post condition: print all the elements in list onto the screen
      public String toString ()
      {
         return null;
      }
   
   /********************************************************/
       public static void print (int [] list)
	   {
		
		
	   }   // print 
		
		
		   
		public static void main(String[] args)
      {
         int [] array = {15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45, 67,
                          100, 44, 28, 1, 3};
         
         OneDimLab obj = new OneDimLab (array);
         System.out.println ("Max: " + obj.findMax());
         System.out.println ("Min: " + obj.findMin());
         System.out.println ("Max index: " + obj.findMaxIndex());
         System.out.println ("Min index: " + obj.findMinIndex());
         System.out.println ("The fact that 3 is in the array is: " + obj.find (3));
      

		 System.out.println("Contents of positive array: " );
		 print(obj.posArray());   
         
		 System.out.println("Contents of negative array: ");
		 print(obj.negArray());
      				   
      	
         System.out.println("Contents of even array: ");
		 print(obj.evenMembers());  
         
		System.out.println("Contents of odd number array: ");
		print(obj.oddMembers()); 			
         
      	      
         System.out.println("Sum : " + obj.sum());
         System.out.println("Avg : " + obj.average());
      
      }  // main
   
   }
   