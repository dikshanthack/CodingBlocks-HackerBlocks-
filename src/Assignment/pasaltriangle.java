package Assignment;

import java.util.Scanner;

public class pasaltriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 0;
		int row = 0;
		while (row < n) {
			int ncr = 1;
			int i = 0;
			while (i <= star) {
				System.out.print( ncr+"\t ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
