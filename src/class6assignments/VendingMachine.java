package class6assignments;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0 ,total=0 ;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a  note to get a change::" );
	      int note = s.nextInt();
	      
	      int a[] =new int[] {1000,500,100,50,10,5,2,1 
                   };
	      for(int i=0;i<8;i++)
	      {
	    	  while(  a[i]<=note)
	    	  {
	    		  total=total+a[i];
	    		  note=note-a[i];
	    		 count++; 
	    	}
	    	  System.out.println(" "+a[i] +" note needed is" +count);
	    	  count=0;
	    	  if(total==note)
	    	  {
	    		  break;
	    	  }
	      }
	                            
	      
	      
	}
	

}
