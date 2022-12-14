package Assignment;

import java.util.*;

public class IF_ELSE_Odd_Even_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int sumodd = 0;
			int sumeven = 0;
			while (n != 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					sumeven = sumeven + rem;
				} else {
					sumodd = sumodd + rem;
				}
				n /= 10;
			}
			if (sumeven % 4 == 0 || sumodd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}

	}
}