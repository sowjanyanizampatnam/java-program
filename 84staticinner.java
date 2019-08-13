/*class outer//accessing static inner class?
{
static int a=50;
static class inner
{
void show()//error
{
System.out.print(a);
}
}
}
class cn
{
public static void main(String [] args)
{
outer.inner.show();// error 'innershow();'illegal start of expession 
}
}

class outer
{
static int a=50;
static class inner
{
static void show()
{
System.out.print(a);
}
}
}
class cn
{
public static void main(String [] args)
{
outer.inner.show();// 50
}
}*/
class outer
{
static int a=50;
static class inner
{
void show()
{
System.out.print(a);
}
}
}
class cn
{
public static void main(String [] args)
{
outer.inner ob=new outer.inner();
ob.show();
}
}// 50



