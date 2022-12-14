package Assignment;


import java.util.*;

public class binary_decimal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			mul *= 2;
			n /= 10;
		}
		System.out.println(ans);
		}
}

