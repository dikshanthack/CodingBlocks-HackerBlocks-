package Assignment;
import java.util.*;
public class RECURSION_tower_of_hanoi {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n, "T1", "T3", "T2");
		System.out.print(count);
	}

	public static void toh(int n, String s, String h, String d) {
		if (n == 0) {
			return;
		}
		toh(n-1, s, d, h);
		System.out.println("Move " + n + "th " + "disc from " + s + " to " + d);
			count++;
		toh(n-1, h, s, d);
	}
}

