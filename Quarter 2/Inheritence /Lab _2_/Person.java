public class Person
{
   private String name;
   private int age;
   
   public Person ()
   { 
      name = "No name yet.";
      age = 0; 
   }
   public Person (String name, int age) 
   {
      this.name = name;
      this.age = age;
   }  
   
   public void setName (String newName)
   {
      name = newName;
   }
   public String getName() 
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }
   public String toString()
   {
      return "Name: " + name + "\nAge: " + age;
   }
   public boolean equals (Person other)
   {
      return (this.name.equalsIgnoreCase(other.name) && this.age == other.age);
   }
}
