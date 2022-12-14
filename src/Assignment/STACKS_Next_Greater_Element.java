package Assignment;

import java.util.*;

public class STACKS_Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			NGE(arr);
		}
	}

	public static void NGE(int[] arr) {
		int[] nge = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				int ii = st.pop();
				nge[ii]=arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			int ii = st.pop();
			nge[ii] = -1;
		}
		for (int i = 0; i < nge.length; i++) {
			System.out.println(arr[i] + "," + nge[i]);
		}
	}
}
