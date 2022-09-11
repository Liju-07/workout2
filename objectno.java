
import java.util.*;
class objectno
  {
     static int count;
	 objectno()
	   {
	     count+=1;
	   }
	 public static void main(String args[])
	  {
	    objectno ob1=new objectno();
		 objectno ob2=new  objectno();
		 objectno ob3=new  objectno();
	    objectno ob4=new  objectno();
		 objectno ob5=new objectno();
		 objectno ob6=new objectno();
		System.out.println("\n Number of object = "+count);
	  }
   }