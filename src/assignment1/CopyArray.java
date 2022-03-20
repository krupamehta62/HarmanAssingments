package assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = s.nextInt();
		int[] original = new int[n];
		System.out.println("Enter the original array elements");
		for (int i = 0; i < n; i++) {
			original[i] = s.nextInt();
		}
		for (int j = 0; j < original.length; j++) {
			System.out.println(original[j] + " ");
		}

		int[] copy = Arrays.copyOf(original, n);
		System.out.println("New array will be:");
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i] + " ");
		}
		s.close();
	}

}
