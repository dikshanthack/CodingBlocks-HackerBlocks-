package Assignment;
import java.util.*;
public class patternnumberandstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner (System.in);
int n = sc.nextInt();
int star = 1 ;
int row = 1;
int val= row;
while (row<=n*2-1) {
	int i = 1;
	while (i <=star) {
		if (i%2==0) {
			System.out.print("*"+"\t");
		}
		else {
			System.out.print(val +"\t");
		}
		i++;
	}
	if 
	(row<n) {
		star+=2;
		val++;
	}
	else {
		star-=2;
		val--;
	}
System.out.println();
row++;
}
	}
}
