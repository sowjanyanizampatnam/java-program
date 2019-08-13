class outer//accesssing inner class  with help of outer class?
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
outer.inner ib=ob.new inner();
ib.show();
}
}
// 20 10 20