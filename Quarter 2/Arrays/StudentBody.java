import java.util.Arrays;
import java.util.Scanner;
public class StudentBody {
	private Student [] students = new Student[3];
	public StudentBody()
   {
	}
	public void init()
	{
		Scanner keyboard = new Scanner (System.in);
		for(int i=0;i<students.length;i++)
		{
			System.out.println(" Enter the id of the student: "+(i+1));
			int id=keyboard.nextInt();
			System.out.println(" Enter the name of the student: "+(i+1));
			String name=keyboard.next();
			System.out.println(" Enter the gpa of the student: "+(i+1));
			double gpa=keyboard.nextDouble();
			Student student= new Student(id, name, gpa);
			students[i]=student;
		}
	}
	public String toString() {
		return "StudentBody [Students="
				+ (students != null ? Arrays.asList(students) : null) + "]";
	}
	public Student search(int id){
		for(int i=0;i<students.length;i++) {
			if(students[i].getId()==id)
				return students[i];
		}
		return null;
	}
}
