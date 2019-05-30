package in.ac.sharda;

public class Student {

	private final int rollNumber;
	private final String name;
	private String email;
    
	public Student(int rn, String n, String email){
		this.rollNumber = rn;
		this.name = n;
		this.email = email;
	}

	public void attendance() {
		System.out.println("Present Sir");
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getname() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			return ((Student)obj)
					.getRollNumber() == rollNumber;
		}
		
		return false;
	}
	
}
