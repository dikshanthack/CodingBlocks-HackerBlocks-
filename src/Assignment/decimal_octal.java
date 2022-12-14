package Assignment;
import java.util.*;
public class decimal_octal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % 8;
			ans = ans + rem * mul;
			mul *= 10;
			n /= 8;
		}
		System.out.println(ans);
	}
}
