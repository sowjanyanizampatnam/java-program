class jaa//write a java program to display the  value in its scope?
{
public static void main(String args[])
{
int a=10;
System.out.println(a);
{
a=67;
System.out.println(a);
}
System.out.print(a);
}
}