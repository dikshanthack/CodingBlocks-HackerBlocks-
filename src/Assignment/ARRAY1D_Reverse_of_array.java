package Assignment;

import java.util.*;

public class ARRAY1D_Reverse_of_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			
		int n  = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr);
	}		

	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"");

		}
	}
}
