class test//write a java program using this keyword accessing 2 constructors?
{
int a;
test()
{
this(5);
System.out.println("hii");
}
test(int x)
{
a=x;
System.out.println(a);
}
}
class con1ob
{
public static void main(String [] args)
{
test ob=new test();
}
}
// 5 hii