package Assignment;
import java.util.Scanner;
public class IF_ELSE_Boston_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (countofdigits(n) == prime(n)) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
	public static int prime(int n) {
		int prime_fact = 0;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				prime_fact = prime_fact + countofdigits(i);
				n /= i;
			}
		}
		return prime_fact;
	}

	public static int countofdigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n /= 10;
		}
		return sum;
	}
}
