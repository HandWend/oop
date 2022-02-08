package ext2;

public class Teacher extends Person {

	private String profesorID;

	public String getProfesorID() {
		return profesorID;
	}

	public void setProfesorID(String profesorID) {
		this.profesorID = profesorID;
	}

	public Teacher(String name, int age, int height, int weight, String profesorID) {
		super(name, age, height, weight);
		this.profesorID = profesorID;
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + ",]Teacher [profesorID=" + profesorID + "]";
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("교수 이름: " + getName());
		System.out.println("교수 나이: " + getAge());
		System.out.println("교수 키: " + getHeight());
		System.out.println("교수 몸무게: " + getWeight());
		System.out.println("교수 아이디: " + getProfesorID());
		
	}
	
}
