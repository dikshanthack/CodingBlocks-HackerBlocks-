package Assignment;

import java.util.*;

public class IF_ELSE_Shopping_game_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();// Harshit
			int m = sc.nextInt();// Aayush
			int Aayushphones = 0;
			int Harshitphones = 0;
			int count = 1;
			while (true) {
				Aayushphones += count;
				if (Aayushphones > m) {
					System.out.println("Harshit");
					break;
				}
				count++;
				Harshitphones += count;
				if (Harshitphones > n) {
					System.out.println("Aayush");
					break;
				}
				count++;
			}
			t--;
		}
	}
}
