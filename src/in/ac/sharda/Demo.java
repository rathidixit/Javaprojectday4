package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1, "Dixit","dixit@123");
		Student s2 = new Student(2, "Rathi","rathi@123");
		System.out.println(s.equals(s2));
		System.out.println(s2.getname());
		System.out.println(s2.getEmail());
	}

}
