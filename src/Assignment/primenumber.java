package Assignment;

import java.util.*;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 0;
		int j = 2;
		while (j <= n) {
			int val = 2;
			while (val < n) {
				if (j%val == 0) {
					fact++;
				}
				val++;
				break;
			}
			if (fact >= 1) {
				System.out.println("not prime");
			} else {
				System.out.println(j+" ");

			}
			j++;
		}
	}
}