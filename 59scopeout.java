class jaa//write a java program for out of the scope?
{
public static void main(String args[])
{
int a=20;
{
System.out.println(a);
int b=30;
}
System.out.print(b);
}
}
//error can't find symbol b