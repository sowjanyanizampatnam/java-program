class test//write a java program for for accesssing the constructor without using this keyword?
{
int a;
test()
{
System.out.println("hii");
}
test(int x)
{
this();
a=x;
System.out.println(a);
}
}
class con21ob
{
public static void main(String [] args)
{
test ob=new test(5);
}
}
// 5