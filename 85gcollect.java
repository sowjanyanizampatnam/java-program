class test//this program for garbage collector?
{
test()
{
System.out.print("helo");
}
protected void finalize()
{
System.out.print("gc"+this);
}
public static void main(String [] args)
{
test ob1=new test();
System.out.print(ob1);
ob1=null;
System.gc();
}
}

