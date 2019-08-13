class ex//write a java program for non-static method?
{
int a;
void display()
{
System.out.println(a);
}
public static void main(String [] args)
{
ex ob=new ex();
ob.a=20;
ob.display();
ex ob2=new ex();
ob2.a=10;
ob2.display();
}
}
