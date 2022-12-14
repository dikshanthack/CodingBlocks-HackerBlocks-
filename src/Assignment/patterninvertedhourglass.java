package Assignment;
import java.util.*;

public class patterninvertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 1;
		int val =n;
		while (row <= n * 2 + 1) {
			int i = 1;
			int v = val;
			while (i <= star) {
				System.out.print(v + "  ");
				i++;
				v--;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("   ");
				j++;
			}
			int k = 1;
			v++;
			if(row==n+1) {
				v++;
				k=2;
			}
			while (k <= star) {
				System.out.print(v + "  ");
				v++;
				k++;

			}
			// mirror
			if (row <= n) {
				star++;
				space -= 2;

			} else {

				star -= 1;
				space += 2;
			
			}
			System.out.println();
			row++;

		}
		sc.close();
	}
}