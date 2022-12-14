package Assignment;

import java.util.*;

public class RECURSION_Dictionary_Order_Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<>();
		Print_smaller(s, "", s, list);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void Print_smaller(String s, String ans, String s1, List<String> list) {
		if (s.length() == 0) {
			if (ans.compareTo(s1) < 0) {
				list.add(ans);
				return;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String str = s.substring(0, i) + s.substring(i + 1);
			Print_smaller(str, ans + ch, s1, list);
		}
	}
}
