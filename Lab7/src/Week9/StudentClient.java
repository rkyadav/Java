package Week9;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Overview: Add code to the Student.java file as indicated in the comments in the file.  Add code to the main method in StudentClient that create 10 Student objects and sort them: 
 * Sort the objects by first name, last name, gpa, and id.  Your progam will create an array of Student objects and 
 * sort the objects.  Display the contents of the unsorted array, and the sorted array after each sort criteria 
 * applied.  
 *  
 */

public class StudentClient {
	
	public static void main(String...strings){
		
		//Add code that creates an array of student objects
		Student[] studentArray = new Student[6];
		studentArray[0] = new Student("Sammy","Sosa",4.00,21);
		studentArray[1] = new Student("Alex","Rodreguiz",3.80,13);
		studentArray[2] = new Student("Dereck","Jeter",4.50,02);
		studentArray[3] = new Student("Kerry","Wood",4.25,34);
		studentArray[4] = new Student("Anthony","Rizzo",4.10,18);
		studentArray[5] = new Student("Mike","Trout",5.00,27);
		//Display the unsorted array
		System.out.println("Unsorted array");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		System.out.println("");
		//Sort the array by first name and display the sorted data
		System.out.println("Sorted by First Name");
		Arrays.sort(studentArray, new Student.ByFirstName());
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		System.out.println("");
		//Sort the array by last name and display the sorted data
		System.out.println("Sorted by Last Name");
		Arrays.sort(studentArray, new Student.ByLastName());
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		System.out.println("");
		//Sort the array by gpa and display the sorted data
		System.out.println("Sorted by GPA");
		Arrays.sort(studentArray, new Student.ByGpa());
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		System.out.println("");
		//Sort the array by id and display the sorted data
		System.out.println("Sorted by ID");
		Arrays.sort(studentArray, new Student.ById());
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		
		//Note: Use the sort method from the Array class
		return;
	}

}
