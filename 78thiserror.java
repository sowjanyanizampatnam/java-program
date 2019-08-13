class test//write a  java program for this keyword, declaration is illigal start of type?
{
int a;
test()
{
System.out.println("hii");
}
test(int x)
{
a=x;
System.out.println(a);
}
this();// illegal start of type
}
class con1ob
{
public static void main(String [] args)
{
test ob=new test(5);
}
}
//error