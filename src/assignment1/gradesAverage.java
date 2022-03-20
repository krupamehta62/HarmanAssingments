package assignment1;
import java.util.*;

public class gradesAverage {

	public static void main(String args[]) {
		double Sum = 0.0;
		double average = 0.0;
		int grade;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numStudents = s.nextInt();
		int grades[] = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter the grades of student:" + (i + 1));
			grade = s.nextInt();

			if (grade > 100 || grade < 0) {
				System.out.println("Invalid grade!Enter grade between 0 to 100...try again");
				i = i - 1;
				grade = s.nextInt();
			}
			Sum += grade;

			grades[i] = grade;
		}
		s.close();
		average = Sum / numStudents;
		System.out.println("The average grade is: " + Sum / numStudents);
	}
}