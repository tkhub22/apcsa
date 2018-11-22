/*
Name: Aditya Tikhe
Period: 7
Due date: Jan 17                         
Date submitted: Jan 17
What I learned:
a. How to work and utilize arrays.
b. How to call arrays and its contents
c. Reviewing loops and if conditions.
Purpose: The purpose of the lab is to break down an array
         and print certain atttributes. 
How I feel about the lab: I think the lab is a good introductory lab
                          for arrays.
What I am wondering: I am wondering why we don't use parenthesis when calling
                     array methods.
*/

public class OneDimLabb
{
   private int[] list;
   public OneDimLabb(int[] array)
   {
      list = array;
   }
	// post condition: find and return the max element in list
   public int findMax()
   {
      int maxIdx= 0;
      for(int i=1;i<list.length;i++)
      {
         if(list[i]>list[maxIdx])
         {
            maxIdx=i;
         }
      }
      return list[maxIdx];
   }
	// post condition: find and return the index of the max element in list
   public int findMaxIndex()
   {
      int maxIdx= 0;
      for(int i=1;i<list.length;i++)
      {
         if(list[i]>list[maxIdx])
         {
            maxIdx=i;
         }
      }
      return maxIdx;
   }
	// post condition: find and return the min element in list
   public int findMin()
   {
      int minIdx= 0;
      for(int i=1;i<list.length;i++)
      {
         if(list[i]<list[minIdx])
         {
            minIdx=i;
         }
      }
      return list[minIdx];
   }
	// post condition: find and return the index of the min element in a
   public int findMinIndex() {
      int minIdx= 0;
      for(int i=1;i<list.length;i++)
      {
         if(list[i]<list[minIdx])
         {
            minIdx=i;
         }
      }
      return minIdx;
   }

	// post condition: check to see if target can be found in list or not. If
	// yes,

	// returns

	// true; otherwise, returns false.
   public boolean find(int target)
   {
      boolean retVal=false;
   	
      for(int i=0;i<list.length;i++)
      {
         if(list[i]==target)
         {
            retVal=true;
            break;
         }
      }
      return retVal;
   }
	// post condition: All the negative numbers are returned in an array
   public int[] negArray()
   {
      int[] retArr;
      int cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]<0)
         {
            cnt++;
         }
      }
      retArr = new int[cnt];
      cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]<0)
         {
            retArr[cnt]=list[i];
            cnt++;
         }
      }		
   
      return retArr;
   }

	// post condition: put all the postivie numbers in list in an array and return the array

   public int[] posArray()
   {
      int[] retArr;
      int cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]>=0)
         {
            cnt++;
         }
      }
   	
      retArr = new int[cnt];
      cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]>=0)
         {
            retArr[cnt]=list[i];
            cnt++;
         }
      }		
      return retArr;
   }
	// post condition: sum up all the numbers in list and return the sum

   public int sum()
   {
      int sum= 0;
      for(int i=1;i<list.length;i++)
      {
         sum=sum+list[i];
      }
      return sum;
   }
	// post condition: finds the average of all the numbers in the array

   public double average()
   {
      double avg =  sum()/list.length;
      return avg;
   
   }
	// post condition: put all the even numbers in list and return the array
   public int[] evenMembers()
   
   {
      int[] retArr;
      int cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]%2==0)
         {
            cnt++;
         }
      }
      retArr = new int[cnt];
      cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]%2==0)
         {
            retArr[cnt]=list[i];
            cnt++;
         }
      }		
      return retArr;
   }
	// post condition: put all the odd numbers in list and return the array
   public int[] oddMembers()
   {
      int[] retArr;
      int cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]%2!=0)
         {
            cnt++;
         }
      }
      retArr = new int[cnt];
      cnt=0;
      for(int i=0;i<list.length;i++)
      {
         if(list[i]%2!=0)
         {
            retArr[cnt]=list[i];
            cnt++;
         }
      }		
      return retArr;
   }
	// post condition: print all the elements in list onto the screen
   public String toString()
   {
      String retVal = "";
      for(int i=0;i<list.length;i++)
      {
         retVal=retVal+list[i];
         if(i<list.length-1)
            retVal=retVal+",";
      }
      return retVal;
   }
	/**/
   public static void main(String[] args)
   {
      int[] array = { 15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45,
         	67, 100, 44, 28, 1, 3 };
      OneDimLabb obj = new OneDimLabb(array);
      System.out.println("Array Contents: " + obj);
      System.out.println("Array Length: " + obj.list.length);
      System.out.println("Max: " + obj.findMax());
      System.out.println("Min: " + obj.findMin());
      System.out.println("Max index: " + obj.findMaxIndex());
      System.out.println("Min index: " + obj.findMinIndex());
      System.out.println("The fact that 3 is in the array is: " + obj.find(3));
      System.out.println("Contents of positive array: " + new OneDimLab(obj.posArray()));
      System.out.println("Contents of negative array: " + new OneDimLab(obj.negArray()));
      System.out.println("Contents of even array: " + new OneDimLab(obj.evenMembers()));
      System.out.println("Contents of odd number array: " + new OneDimLab(obj.oddMembers()));
      System.out.println("Sum : " + obj.sum());
      System.out.println("Avg : " + obj.average());
   }
}
/*
 Array Contents: 15,-5,25,75,9,-2,-80,-100,99,21,23,40,45,67,100,44,28,1,3
 Array Length: 19
 Max: 100
 Min: -100
 Max index: 14
 Min index: 7
 The fact that 3 is in the array is: true
 Contents of positive array: null
 Contents of negative array: null
 Contents of even array: null
 Contents of odd number array: null
 Sum : 393
 Avg : 20.0
*/