package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 int n;
		 Scanner input = new Scanner(System.in);

		    System.out.println("Enter the value of n");
		    n = input.nextInt();
		    if (n<=2) {
		    	System.out.println("Invalid parameters, n must be at least 2\n");
		    	input.close();
		        return;
		    }
		    input.close();

		    long a[] = new long[n];
		    a[0] = 0;
		    a[1] = 1;
		    int i = 2;
		         
		    while (i<n) {
		        a[i] = a[i-1] + a[i-2];
		        i++;
		    }

		    System.out.println("a[" + n + "] = " + a[n-1]);	

	}

}
