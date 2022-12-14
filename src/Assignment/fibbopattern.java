package Assignment;
import java.util.*;
public class fibbopattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int row = 1 ;
int star =1 ;
int a = 0;
int b= 1; 

while (row <=n ) {
	int i= 1;
	while (i<=row) {
		System.out.print(a+"\t");
		int c = a+b ;
		a=b;
		b=c;
		i++;
	}
	System.out.println();
	row++;
//	star++;
}

	}

}
