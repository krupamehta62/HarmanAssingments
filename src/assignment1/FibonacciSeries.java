package assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n;
		int n1 = 0, n2 = 1;
		double sum = 1;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i <= 20; i++) {
			n = n1 + n2;
			sum += n;
			n1 = n2;
			n2 = n;

			System.out.print(n + " ");
		}
		System.out.println("average of fibonacci series is:" + sum / 20);
	}

}
