package Assignment;

import java.util.*;

public class patternrhombusstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = n/2;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*"+ "\t");
				j++;
			}
			if (row < (n/2)+1) {

				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}

			System.out.println();
			row++;
//			space--;
//			star+=2;
		}

	}

}
