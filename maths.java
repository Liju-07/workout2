import java.util.*;
import java.lang.Math;
class calculator
	 {
    int x,y,r1,r2;
double r3;
	
    void read()
		   {
	         System.out.println("\n Enter two numbers");
			 Scanner sc = new Scanner(System.in);		
		     x=sc.nextInt();
		     y=sc.nextInt();
		   }
    void add()
		   {
		     r1=x+y;
			 
		   
		   }
    void multiply()
		   {
		     r2=x*y;
			
		  
		   }
    double power()
		   {
		     r3=(Math.pow(x,y));
return 0;
			}
		  
	void display()
	       { 
			 System.out.println("\n  Sum of "+x +" and "+y +"      = "+r1 );
			 System.out.println("\n  Product of "+x +" and "+y +"  = "+r2);
			 System.out.println("\n  Power of "+x +" and "+y +"    = "+r3 );
            }
  }
  
  public class maths
  {
    public static void main(String args[])
      {
       
              calculator c = new calculator();
	          
			  c.read();
			  c.add();
			  c.multiply();
			  c.power();
                          c.display();
	   
      }
  }