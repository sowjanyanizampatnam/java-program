class outer
{
int a;
void display()
{
inner ob=new inner();
ob.show();
a=10;
System.out.println(a);
}
class inner
{
int b;
void show()
{
inner ob=new inner();
ob.display();
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