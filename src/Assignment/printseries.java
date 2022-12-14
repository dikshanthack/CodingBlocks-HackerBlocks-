package Assignment; 
import java.util.*;

public class printseries {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 1;
        int print = 1;
         while(print<=n) {
        	 int rem = 3 * sum + 2;
        	 if (rem % m != 0) {
        		 System.out.println(""+rem);
        		 print++;
        	 }
        	 sum++;
        	 
         }
      }
}