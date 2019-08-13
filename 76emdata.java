import java.util.*;//write a java program for display the employ data?
class employ
{
String eid,ename;
byte age;
float salary;
void input()
{
Scanner read=new Scanner(System.in);
System.out.println("enter employ name:");
ename=read.nextLine();
System.out.println("enter employ id:");
eid=read.nextLine();
System.out.println("enter employ age:");
age=read.nextByte();
System.out.println("enter employ salary:");
salary=read.nextFloat();
}
void display()
{
System.out.println("enter employ details are:");
System.out.println("\n name:"+ename);
System.out.println("\n id:"+eid);
System.out.println("\n age:"+age);
System.out.println("\n salary:"+salary);
}
}
class main
{
public static void main(String [] args)
{
employ e1=new employ();
e1.input();
e1.display();
}
}