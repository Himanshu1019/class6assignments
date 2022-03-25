package class6assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a,rev=0;
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a  number to check a reverse  ::" );
	      int num = sc.nextInt();
	      while(num>0)
	      {
	    	a=num%10;
	    	num=num/10;
	    	rev=rev*10+a;
	      }
	      System.out.println("the reversde of the given number is ::" + rev);

	}

}
