package Assignment;

import java.util.*;

public class ARRAYLIST_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] brr = new int[m];
		for (int j = 0; j < brr.length; j++) {
			brr[j] = sc.nextInt();
		}
		sumofarrays(arr, brr);

	}

	public static void sumofarrays(int[] arr, int[] brr) {
		int i = arr.length - 1;
		int j = brr.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr[i];
				i--;
			}
			if (j >= 0) {
				sum += brr[j];
				j--;
			}
			sum += carry;
	
			list.add(0, sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			list.add(0, carry);
		}
		for ( int v = 0; v < list.size(); v++) {
			System.out.print(list.get(v) + ", ");
		}
		System.out.println("END");
	}
}
