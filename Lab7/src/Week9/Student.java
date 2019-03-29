package Week9;

//import edu.princeton.cs.algs4.*;
/******************************************************************************
 *  Compilation:  javac Student.java
 *  Execution:    java Transaction
 *  Dependencies: StdOut.java
 *  
 *  Data type for commercial transactions.
 *
 ******************************************************************************/

import java.util.Arrays;
import java.util.Comparator;

/**
 *  The {@code Student} class is an immutable data type to encapsulate a
 *  student information with a student first name, last name, id, gpa, date.
 */
public class Student implements Comparable<Student> {
    
	private final String firstName;      // customer
    private final String lastName;     // date
    private final double gpa;   // amount
    private final int id;


    /**
     * Initializes a new student from the given arguments.
     *
     * @param  first name
     * @param  last name
     * @param  student gpa
     * @param student id
     */
    public Student(String firstName, String lastName, double gpa, int id) {
    	//add code that initializes student instance variables
    	this.firstName = firstName;
    	this.lastName= lastName;
    	this.gpa = gpa;
    	this.id = id;
  
    }


    /**
     * Returns the first name of the student.
     * @return 
     *
     * @return the first name of the student
     */
    
    //Add method firstName() that returns the student's first name
   public String firstName() {
	   return this.firstName;
   }
 
    /**
     * Returns the last name of the student.
     *
     * @return the last name of the student
     */
  //Add method lastName() that returns the student's last name
   public String lastName() {
	   return this.lastName;
   }
    
    /**
     * Returns the gpa of the student.
     *
     * @return the gpa of the student
     */
    
  //Add method gpa() that returns the student's gpa
   public String gpa() {
	   String gpa = "" + this.gpa;
	   return gpa;
   }
    /**
     * Returns the id of the student.
     *
     * @return the id of the student
     */
    
  //Add method id() that returns the student's id
   public String id() {
	   String id = "" + this.id;
	   return id;
   }


    /**
     * Returns a string representation of this student.
     *
     * @return a string representation of this student
     */
    //Add toString method that returns a formatted the instance variables for the class
    @Override
    public String toString() {
    	//add Code
    	String code = this.id + ": " + this.firstName + " " + this.lastName + " " + this.gpa;
        return code;
    }

    /**
     * Compares two students by id.
     *
     * @param  that the other student
     * @return { a negative integer, zero, a positive integer}, depending
     *         on whether the id of this student is { less than,
     *         equal to, or greater than } the id of that student
     */
    
    //Add code that compares one student's id to another
    public int compareTo(Student that) {
    	return Integer.compare(this.id, that.id);
    }    

    /**
     * Compares this student to the specified object.
     *
     * @param  other the other student
     * @return true if this student is equal to {@code other}; false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Student that = (Student) other;
        //add code that returns true when this student's id, first name, and last name match other student
        if (this.id() == that.id() && this.firstName() == that.firstName() && this.lastName() == that.lastName()) {
        	return true;
        }
        return false;
    }


    /**
     * Returns a hash code for this student.
     *
     * @return a hash code for this student
     */
    public int hashCode() {
        int hash = 1;
        hash = 31*hash + firstName.hashCode();
        hash = 31*hash + lastName.hashCode();
        hash = 31*hash + ((Integer) id).hashCode();
        hash = 31*hash + ((Double) gpa).hashCode();
        return hash;
    }

    /**
     * Compares two students by first name.
     */
    //Add static class that compares two students by first name
    //Name the class ByFirstName.  This class implements Comparator
    public static class ByFirstName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return (o1.firstName).compareTo(o2.firstName);
		}

	}

    /**
     * Compares two students by last name.
     */
    //Add static class that compares two students by last name
    //Name the class ByLastName.  This class implements Comparator
    public static class ByLastName implements Comparator<Student>  {

		@Override
		public int compare(Student o1, Student o2) {

			return (o1.lastName).compareTo(o2.lastName);
		}

	}

    /**
     * Compares two students by gpa.
     */
    //Add static class that compares two students by gpa
    //Name the class ByGpa.  This class implements Comparator
    public static class ByGpa implements Comparator<Student>  {

		@Override
		public int compare(Student o1, Student o2) {
			return (o1.gpa()).compareTo(o2.gpa());
		}

	}
    /**
     * Compares two students by id.
     */
    
    //Add static class that compares two students by id
    //Name the class ById.  This class implements Comparator
    public static class ById implements Comparator<Student>  {

		@Override
		public int compare(Student o1, Student o2) {
			return (o1.id()).compareTo(o2.id());
		}

	} 
    
}



