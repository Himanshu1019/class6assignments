package class6assignments;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perfect=0,i=1;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a  number  to check perfect number::" );
	      int num = s.nextInt();
	      
	     while(i<num)
	     {
	    	 if(num%i==0)
	    	 {
	    		 perfect= perfect +i;
	    		 
	    	 }i++;
	    	 
	     }
	     if(num==perfect)
	     {
	    	 System.out.println("yes the number is an  perfect number::" );
	     }
	     else 
	     {
	    	 System.out.println("sorry the number is not  an  perfect number::" );
	     }
	}

}
