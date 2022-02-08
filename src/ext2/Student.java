package ext2;

public class Student extends Person {
	
	private String studentID;
	private int grade;
	private double GPA; // Grade Point Average
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + getName() + "]Student [studentID=" + studentID + ", grade=" + grade + ", GPA=" + GPA + "]";
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
	}

	
	
	
	
	
	
	
}
