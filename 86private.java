/*private access specifier*/
class test
{
private int a;
test()
{
a=10;
}
int display()
{
return a;
}
}
class test_p
{
public static void main(String[] argh)
{
test ob=new test();
System.out.print(ob.display());
}
}