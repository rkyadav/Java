package week4;

public class Employee {
	
	private String fName;
	private String lName;
	
	public Employee(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public String toString() {
		return fName + " " + lName;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public boolean equals(Object x) {
		if (this == x) return true;
		if (x == null) return false;
		if (this.getClass() != x.getClass()) return false;
		Employee that = (Employee) x;
		if (this.fName != that.fName) return false;
		if (this.lName != that.lName) return false;
		return true;
	}

}
