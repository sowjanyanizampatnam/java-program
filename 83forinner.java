/*class outer// accessing innerclass using for loop?s
{
int a=10;
void display()
{
for(int i=0;i<10;i++)
{
	class inner 
	{
	void show()
	{
	System.out.println(a);
	}
	}
inner ob=new inner();
ob.show();
}
}
}
class test_p
{
public static void main(String [] args)
{
outer ob=new outer();
ob.display();
}
}
//10  prints 10 times.*/
class outer
{
int a=10;
void print()
{
System.out.println(b);
}
void display()
{
for(int i=0;i<10;i++)
{
	class inner 
	{
	int b;
	void show()
	{
	System.out.println(a);
	}
	}
inner ob=new inner();
ob.show();
}
}
}
class test_p
{
public static void main(String [] args)
{
outer ob=new outer();
ob.display();
ob.print();
}
}
//error class outer  symbol cant found.