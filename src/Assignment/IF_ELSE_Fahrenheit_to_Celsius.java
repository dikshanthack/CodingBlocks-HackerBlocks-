package Assignment;

import java.util.*;

public class IF_ELSE_Fahrenheit_to_Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min_value = sc.nextInt();
		int max_value = sc.nextInt();
		int step = sc.nextInt();
		int temp = 0;
		while(temp<=max_value){
			int c = (int)(5/9f*(temp-32));
			System.out.println(temp+"  "+c);
			temp+=20;
		}
		
	}
}

