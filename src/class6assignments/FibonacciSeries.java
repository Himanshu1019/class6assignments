package class6assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third,i=1;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a  number  to print fibonacci serries::" );
	      int num = s.nextInt();
	      System.out.println("the fibonacci series is" );
		 System.out.println(" "+first);
		 System.out.println(" "+second);
		 
	      while(i<=num)
	      		{
	    	  third=first+second;
	    	  System.out.println(" "+third);
	    	  first=second;
	    	  second=third;
	    	  i++;
	    	  }

	}

}
