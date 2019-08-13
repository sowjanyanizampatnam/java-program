class te//give object as a parameter to the method
{ 
int a;
te()
{
a=10;
System.out.print(a);
}
void display(te ob1)
{
System.out.println("inside="+ob1.a);
a=ob1.a;
System.out.println(a);
}
}
class test
{
public static void main(String[] argh)
{
te ob1=new te();
te ob2=new te();
ob2.display(ob1);
ob1.a=70;
ob2.display(ob1);
}
}
