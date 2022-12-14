package Assignment;

import java.util.*;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int star = n;
		while (i <= n) {
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
			star--;
          
		}

	}

}
