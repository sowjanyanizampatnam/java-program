class test//accessing constructor in different models?
{
test()
{
System.out.println("constructor");
}
void display()
{
System.out.println("helow");
}
void print()
{
System.out.println("hai");
display();
}
}
class progr
{
public static void main(String[] args)
{
test ob=new test();
ob.print();
test ob1=new test();
}
}