package Assignment;

import java.util.*;

public class doublesidedarrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = -1;
		int space1 = n - 1;
		int star = 1;
		int val = row;
	
		while (row <= n) {
			int k = 1;
			while (k <= space1) {
				System.out.print("  ");
				k++;
			}
			int i = 1;
			int v = val;
			while (i <= star) {
				System.out.print(v + " ");
				i++;
				v--;
			}
			int m = 1;
			while (m <= space) {
				System.out.print("  ");
				m++;
			}
			int j = 1;
//			 v= row;
			if (row == 1 || row == n) {
				j = 2;
			}
			v++;
			while (j <= star) {
				System.out.print(v + " ");
				v++;
				j++;

			}
			if (row <= (n / 2)) {
				star++;
				space += 2;
				space1 -= 2;
				val++;

			} else {
				star--;
				space1 += 2;
				space -= 2;
				val--;
			}
			System.out.println();
			row++;

		}
		}
}