package Assignment;

import java.util.*;

public class patternwithzeores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1 ;
		int star = 1;
		
		while (row<=n) {
			int i=1;
			while (i<=star) {
				if(i==1 || i == star) {
				System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				i++;
				
			}
			System.out.println();
			row++;
			star++;
			
		}
	}

}
