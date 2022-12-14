package Assignment;

import java.util.*;

public class RECURSION_Queen_combination_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		boolean[] board = new boolean[n + 1];
		int tq = 2;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		combination(board, tq, ans, 0, 1, list);
		System.out.println(list);
	}

	public static void combination(boolean[] board, int tq, ArrayList<Integer> ans, int qpsf, int idx,
			ArrayList<ArrayList<Integer>> list) {
		if (tq == qpsf) {
//					System.out.println(ans + " ");
			list.add(new ArrayList<>(ans));
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				ans.add(i);
				combination(board, tq, ans, qpsf + 1, i + 1, list);
				board[i] = false;// BACKTRACKING
				ans.remove(ans.size() - 1);
			}
		}

	}

}
