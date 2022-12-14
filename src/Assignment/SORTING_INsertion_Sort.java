package Assignment;

import java.util.*;

public class SORTING_INsertion_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5, 4, 3, 2, 1,0 };
		sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while (j >=0  && arr[i] <item) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
	}
}
