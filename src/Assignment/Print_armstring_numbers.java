package Assignment;

import java.util.*;

public class Print_armstring_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			if (Armstrongnumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	public static boolean Armstrongnumber(int n) {
		int cod = countdigit(n);
		int sum = 0;
		int x = n;
		while (n != 0) {
			int rem = n % 10;
			sum += Math.pow(rem, cod);
			n = n / 10;
		}
		if (sum == x) {
			return true;
		}
		return false;
	}

	public static int countdigit(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
