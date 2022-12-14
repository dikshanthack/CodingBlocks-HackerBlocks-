package Assignment;

import java.util.*;

public class RECURSION_lexico_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print_lexico(0, n);
	}

	public static void print_lexico(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			print_lexico(curr * 10 + i, end);
		}
	}
}
