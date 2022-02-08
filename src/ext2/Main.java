package ext2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("양희원", 20, 175, 60, "5500835", 4, 3.4);
		Student student2 = new Student("이순신", 55, 183, 78, "5500836", 4, 3.2);
		
		System.out.println("------------------------");
		
		System.out.println(student1.toString());
		System.out.println(student2);
		
		student1.show();
		student2.show();
		
		
		

	}

}
