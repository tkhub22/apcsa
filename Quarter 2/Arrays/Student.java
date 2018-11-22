/*
Aditya Tikhe
Period: 7
Due Date: 1/13
Date Submitted: 1/13
*/
public class Student
   {
	private int id;
	private String name;
	private double gpa;
	public Student() 
   {
	}
	public Student(int id, String name, double gpa) 
   {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}
}
