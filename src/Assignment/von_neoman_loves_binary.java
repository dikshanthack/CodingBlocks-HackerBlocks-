package Assignment;

import java.util.*;

public class von_neoman_loves_binary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
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
			t--;
		}
	}
}
