package Assignment;

import java.util.*;

public class Upper_and_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int i = (int) (ch);
		if (i >= 65 && i <= 91) {
			System.out.println("UPPERCASE");
		}
		else if(i>=97 && i<=123){
			System.out.println("lowecase");
		}
		else {
			System.out.println("invalid");
		}
	}
}
