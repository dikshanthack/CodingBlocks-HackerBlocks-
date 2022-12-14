package Assignment;

import java.util.*;

public class STACKS_Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		stock_span(arr);
	}

	public static void stock_span(int[] arr) {
		int[] span = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}
			st.push(i);
		}
		for (int i = 0;i<span.length;i++) {
			System.out.print(span[i]+" ");
		}
		System.out.println("END");

	}
}
