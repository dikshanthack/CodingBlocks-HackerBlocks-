package Assignment;

import java.util.*;

public class IF_ELSE_countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		while (n != 0) {
			int rem  = n % 10;
			if (rem == m) {
				count++;
			}
			n = n / 10;
		}
		System.out.print(count);

	}
}
