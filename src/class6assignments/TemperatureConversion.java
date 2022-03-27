package class6assignments;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter option to perform the temperature conversion::" );
	      int option=  s.nextInt();
	      if(option==1)
	      {
	      System.out.println("Enter a  temperaturein in celsius::" );
	      int cel = s.nextInt();
	       a= cel*9/5 + 32 ;
	       System.out.println("the temperature from celcius to ferinide is::"+a );
	      }
	      else if(option==2)
	      {
	      System.out.println("Enter a  temperaturein in ferinade::" );
	      int fe = s.nextInt();
	      a=(fe-32)*5/9;
	      System.out.println("the temperature from ferinide to celcius is::"+a );
	      }
	      else
	      {
	    	  System.out.println("please enter the right option");
	      }
	    	  
	      
	     
	}

}
