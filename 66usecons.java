class ex//write a java program for accessing constructor?
{
int a,b;
ex(int x)
{
a=x;
}
}
class main
{
public static void main(String [] args)
{
ex ob=new ex(20);
ob.b=23;
System.out.println(ob.a);
System.out.print(ob.b);
}
}
