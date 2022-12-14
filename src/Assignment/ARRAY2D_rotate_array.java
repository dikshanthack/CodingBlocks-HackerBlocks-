package Assignment;

import java.util.Scanner;

public class ARRAY2D_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = sc.nextInt();
		rotatearray(arr, k);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void rotatearray(int arr[], int k) { // for rotation
		k = k % arr.length;
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int arr[], int i, int j) { // reverse
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
