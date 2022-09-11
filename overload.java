
import java.util.*;
class calculation
	 {
    void multiply(int a,int b)
		   {
		     int x=a;
			 int y=b;
	         System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
    void multiply(double a,double b)
		   {
		     double x=a;
			 double y=b;
		     System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
    void multiply(double a,int b)
		   {
		     double x=a;
			 int y=b;
		     System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
  }
  
  public class overload
  {
    public static void main(String args[])
      {
        
              calculation mf = new calculation();
	          mf.multiply(10,5);
			  mf.multiply(12.0,8.0);
			  mf.multiply(10.0,30);
	   
      }
  }