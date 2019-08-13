class outer//write a java program for accessing innnerclass in the outer class with the help of outer object method? 
{
int a;
void display()
{
inner ob=new inner();
ob.show();
a=10;// 
System.out.println(a);
}
class inner
{
int b;
void show()
{
b=20;
System.out.println(b);
}
}
}
class t_p
{
public static void main(String [] args)
{
outer ob=new outer();
ob.display();
}
}
//20 10