class test //here 'this' act as variable?
{
int a=10;
test()
{
int a=100;
System.out.print(a);
}
void dislay(int a)
{
this.a=20;/*this- to indicate class variable*/
System.out.print(a);
}
}
class t
{
public static void main(String[] argh)
{
test ob=new test();
ob.dislay(3);
}
}