package Assignment;

import java.util.*;

public class Sum_of_odd_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sumeven = 0;
			int sumodd = 0;
			int count = 0;
			while (n != 0) {
				int rem = n % 10;
				if (count % 2 == 0) {
					sumeven = sumeven + rem;
				} else {
					sumodd = sumodd + rem;
				}
				n = n / 10;
				count++;
			}
			System.out.println(sumodd);
			System.out.println(sumeven);
	}
}
