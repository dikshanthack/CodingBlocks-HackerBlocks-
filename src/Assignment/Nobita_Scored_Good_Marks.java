package Assignment;

import java.util.*;

public class Nobita_Scored_Good_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(return_candy(x, n));
		}
	}

	public static int return_candy(int x, int n) {
		int rem = x % n;
		int y = n - rem;
		int ans  = Math.min(rem, y);
		return ans;
	}
}
