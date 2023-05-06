package week3_assingment;
import java.util.*;
import java.util.stream.Collectors;
public class StudentStream {
	
public static void main(String []args) {
	        ArrayList<Student> students = new ArrayList<>();
	        students.add(new Student(1, "shalu", 98, "A+"));
	        students.add(new Student(2, "Shreya", 95, "A+"));
	        students.add(new Student(3, "Shweta", 87, "A"));
	        students.add(new Student(4, "Aastha", 76, "B"));
	        students.add(new Student(5, "Amal", 88, "A"));
	        students.add(new Student(6, "Akash", 90, "A"));
	        students.add(new Student(7, "Aman", 73, "B"));

	        // Sort the list in descending order based on age using the Stream API
	        ArrayList<Student> sortedStudents = students.stream()
	                .sorted(Comparator.comparing(Student::getProblem_solved).reversed()).limit(5)
	                .collect(Collectors.toCollection(ArrayList::new));


	        System.out.println("Top 5 students by age:");
	        // Print the sorted list
	        sortedStudents.forEach(student -> System.out.println(student.getName() + " " + student.getProblem_solved()+"  "+student.getGrade()));
	    }
	}

	
