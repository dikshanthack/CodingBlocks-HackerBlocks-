package Assignment;
import java.util.*;
public class crosspattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int row = 1;
int star = 1;
int space = n-2;
int spacei = 0;
while (row<=n) {
	int i=1;
	while(i<=spacei) {
		System.out.print("  ");
		i++;
	}
	int j=1;
	while(j<=star) {
		System.out.print("* "); 
		j++;
	}
	int k=1;
	while(k<=space) {
		System.out.print("  ");
		k++;
	}
	int p=1;
	if (row ==(n/2)+1) {
		p=2;
	}
	while(p<=star) {
		System.out.print("* ");
		p++;
}
	if (row<(n/2)+1) {
		spacei++;
		space-=2;
	}
	else {
		spacei--;
		space+=2;
	}
	System.out.println();
	row++;

	}
	}
}
