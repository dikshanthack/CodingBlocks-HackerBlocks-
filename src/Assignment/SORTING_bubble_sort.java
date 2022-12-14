package Assignment;

//import java.util.*;
public class SORTING_bubble_sort {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 4, 7, 8, 2 };

		sort(arr);

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}