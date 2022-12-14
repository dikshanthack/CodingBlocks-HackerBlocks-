package Assignment;
import java.util.*;

public class convertion_any_any {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int sb = sc.nextInt();
			int db = sc.nextInt();
			int sn = sc.nextInt();
			int mul = 1;
			int ans = 0;
			while (sn != 0) {
				int rem = sn % 10;
				ans = ans + rem * mul;
				mul *= sb;
				sn /= 10;
			}
			int mul1 = 1;
			int sum = 0;
			while (ans != 0) {
				int rem = ans % db ;
				sum = sum + rem * mul1;
				mul1*=10;
				ans/=db;
			}
			System.out.print(sum);
		}
	}

