
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class ClockClassTest {


	 @BeforeClass 
	  public static void testSetup(){
		 System.out.println ("Start of Unit Test");

	  }
	  
	  @AfterClass 
	  public static void testCleanup(){
		  System.out.println ("End of Unit Test");
	  }

	  public String validate (String time)
	  {
		 return "x"; 
	  }
	  
	  @Test
	  public void ClockDisplay_Midnight() {
	        ClockClass clck = new ClockClass();
		    String loop = "Y";
		  Scanner repeat = new Scanner (System.in)  ;
		  while (loop.equalsIgnoreCase("Y"))
		  {	  
			  Scanner user_input = new Scanner (System.in);
			  System.out.println ("Enter Hours between 0 - 24: ");
			int hrs = user_input.nextInt();
			while ((hrs < 0 || hrs > 24))
		   	   {
				 System.out.println("Enter hours between [0-24]" );
				 hrs = user_input.nextInt();
		   	    }
		    
			  System.out.println ("Enter Minutes between 0 to 59 : ");
			  int mts = user_input.nextInt();
			   while ((mts < 0 || mts > 59))
		        {
				   System.out.println("Enter minutes between [1-59]" );
				   mts = user_input.nextInt();
		        }
		    
			  String disp;
			  disp = clck.Display(hrs,mts);
			  System.out.println("Test : " + disp);
			  
			    System.out.println ("Do you want to run another test (Press y or Y to continue or any other key for exit");
			    loop = repeat.next();
		  }
	 
	  }

	  }
