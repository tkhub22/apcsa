public class TestTruck
{
   public static void main (String [] args)
   {
      Truck ford = new Truck ();
      Person aditya = new Person("Aditya", 16);
      Truck monster = new Truck ("Lau", 10, aditya, 125000.5, 135000);
      
      System.out.println("Name: " + ford.getMName() + "\nNumber of Cylinders: " + ford.getCylinder() +
      "\nOwner: " + ford.getOwner() + "\nLoad Capacity: " + ford.getLoadCapacity() + "\nTowing Capacity: " +
      ford.getTowingCapacity());
      System.out.println();
      System.out.println("Name: " + monster.getMName() + "\nNumber of Cylinders: " + monster.getCylinder() +
      "\nOwner: " + monster.getOwner() + "\nLoad Capacity: " + monster.getLoadCapacity() + "\nTowing Capacity: " +
      monster.getTowingCapacity());
   }
}
/*
 Name: Lau1
 Number of Cylinders: 5
 Owner: Name: No name yet.
 Age: 0
 Load Capacity: 0.0
 Towing Capacity: 0
 
 Name: Lau
 Number of Cylinders: 10
 Owner: Name: Aditya
 Age: 16
 Load Capacity: 125000.5
 Towing Capacity: 135000
*/