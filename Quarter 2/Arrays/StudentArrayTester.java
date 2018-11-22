import java.util.Scanner;
public class StudentArrayTester
{
	public static void main (String [] args)
	{
		StudentBody students = new StudentBody();
		students.init();
		Scanner keyboard = new Scanner (System.in);
		System.out.println(" Enter the id of the student you are looking for:");
				int studentID = keyboard.nextInt();
		Student target = students.search(studentID);
		if (target != null)
			System.out.println (target);
		else
			System.out.println("Student not found ... ");
		System.out.println("Student Body Information: " + students);
	} 
} 
/*
  Enter the id of the student: 1
 123
  Enter the name of the student: 1
 Aditya
  Enter the gpa of the student: 1
 4
  Enter the id of the student: 2
 234
  Enter the name of the student: 2
 Lau
  Enter the gpa of the student: 2
 5
  Enter the id of the student: 3
 456
  Enter the name of the student: 3
 Kevin
  Enter the gpa of the student: 3
 3
  Enter the id of the student you are looking for:
 123
 Student [id=123, name=Aditya, gpa=4.0]
 Student Body Information: StudentBody [Students=[Student [id=123, name=Aditya, gpa=4.0], Student [id=234, name=Lau, gpa=5.0], Student [id=456, name=Kevin, gpa=3.0]]]
*/