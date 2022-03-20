package assignment1;

import java.util.Scanner;

public class nextDate {

	public static void main(String[] args) {
		// Scanning the data
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Day");
		int day = s.nextInt();
		System.out.println("Enter the month");
		int month = s.nextInt();
		System.out.println("Enter the year");
		int year = s.nextInt();

		System.out.println("You have entered:" + day + "/" + month + "/" + year);

		int a[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		day += 1;

		if (day > a[month]) {
			if (month == 2 && year % 4 == 0) {
				day = 29;
			} else {

				day = 1;
				if (month == 12) {
					month = 1;
					year++;
				} else
					month++;

			}
		}
		System.out.println("Next date is:" + day + "/" + month + "/" + year);
	}
}
