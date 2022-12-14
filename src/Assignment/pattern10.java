package Assignment;

import java.util.*;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int val = n-1;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int v = val;
			int j = 1;
			v++;
			while (j <= star) {
				if (row==1) {
					System.out.print("0 ");
					break;
				}
//				System.out.print(v + " ");
				if(j==(star/2)+1) {
					System.out.print("0 ");
				}
				else {
					System.out.print(v+" ");
					
				}
				if (j <=(star / 2)) {
					v++;
				}
				else {
					v--;
				}
				
				j++;
			}
			System.out.println();
			row++;
			star += 2;
			space -= 1;
			val--;
		}

	}

}