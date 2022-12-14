package Assignment;

import java.util.*;

public class STACKS_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(AOR(arr));
	}

	public static long AOR(long[] arr) {
		Stack<Integer> st = new Stack<>();
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				long r = i;
				long h = arr[st.pop()];
				if (st.isEmpty()) {
					ans =  Math.max(ans, h*r);
				} else {
					long l = st.peek();
					ans =  Math.max(ans, h * (r - l - 1));
				}

			}
			st.push(i);
		}
		long r = arr.length;
		while(!st.isEmpty()) {
			long h = arr[st.pop()];
			if (st.isEmpty()) {
				ans =  Math.max(ans, h);
			} else {
				int l = st.peek();
				ans =  Math.max(ans, h * (r - l - 1));
			}

		}
		return ans;

	}
}
