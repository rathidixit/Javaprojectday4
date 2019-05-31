package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
	private Set<Department> departments
	                        = new TreeSet<>();

	public boolean addDepartment(Department d) {
		return departments.add(d);
	}
	public void printDepartment() {
		departments.parallelStream()
		.forEach(s -> System.out.println(s.getId()));	
	}
	public void resultDeclared() {
		System.out.println("result just arrived!!");
	}
}
