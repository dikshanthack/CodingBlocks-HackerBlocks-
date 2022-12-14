package Assignment;

import java.util.*;

public class ARRAYLIST_Diagonal_Traversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] ans = transverse(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] transverse(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[m * n];
		int index = 0;
		for (int d = 0; d < m + n - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < m) {
				r = 0;
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < n && c >= 0) {
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
//			for (int v : list) {
//				ans[index] = v;
//				index++;
//			}
			for (int j = 0; j < list.size(); j++) {
				ans[index] = list.get(j);
				index++;
			}
		}
		return ans;
	}
}
