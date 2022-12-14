package Assignment;

import java.util.*;

public class patternhourglas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		int val = n;
		int star = n * 2 + 1;
		while (row <= n * 2 + 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int v = val;
			while (j <= star) {
				System.out.print(v + " ");
				if (j <= (star / 2)) {
					v--;
				}

				else {
					v++;
				}
				j++;

			}
			if (row <=n ) {
				star -= 2;
				space += 1;
				val--;
			} else {
				star += 2;
				space -= 1;
				val++;
			}

			System.out.println();
			row++;
		}

	}
}
