import java.util.*;
class employee
{
String name;
int id;
float result,ass1,ass2,ass3,percentage;
employee()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name,id,and 3 marks");
name=s.nextLine();
id=s.nextInt();
ass1=s.nextFloat();
ass2=s.nextFloat();
ass3=s.nextFloat();
}
void cal()
{
result=ass1+ass2+ass3;
percentage=(result/300)*100;
}
void show()
{
System.out.println("Name :"+name);
System.out.println("Employe Id :"+id);
System.out.println("Result :"+result);
System.out.println("Percentage :"+percentage+"%");
if(percentage>=70)
{
System.out.println("Promoted");
}
else
{
System.out.println(" Not Promoted");
}
}
public static void main(String args[])
{
employee emp=new employee();
emp.cal();
emp.show();

}}




