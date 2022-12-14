package Assignment;

import java.util.*;

public class patternrhombusnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int val = 1;
		while (row <= n * 2 - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");

				i++;
			}
			int j = 1;
			
			while (j <= star) {
				System.out.print(val + "\t");
				if (j < (star / 2) + 1) {
					val++;

				} else {
					val--;
				}
				j++;
			}
			
			if (row < n) {
				val+=2;
				star += 2;
				space--;

			} else {
				star -= 2;
				space++;

			}

			System.out.println();
			row++;
		}
		sc.close();
	}

}
