package class6assignments;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("please enter the years::" );
	      int y=s.nextInt();
	      
			System.out.println("please enter the principle loan::" );
		      int p=s.nextInt();
		      
				System.out.println("please enter the percent::" );
			      int r=s.nextInt();
			      
			    int a=12*y;
			    int b=r/(12*100);
			  int  payment=p*b/1-((1+b)^(-a));
	System.out.println("the monthly payment for "+y+"years you need to pay is::" +payment);

}}