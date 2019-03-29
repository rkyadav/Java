package week4;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee aStaff = new Staff("Jean", "Doe", 40.5);
		Employee bStaff = aStaff;
		Employee anEmployee = new Employee("John", "Doe");
		
		System.out.println(aStaff);
		System.out.println(anEmployee);
		if(aStaff.equals(bStaff)) {
			System.out.println("They are equal");
		}
	}
}
