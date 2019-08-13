nimport java.util.Scanner;//write a java program for linear search?
class lsearch{
public static void main(String args[]){
int b,s;
Scanner n=new Scanner(System.in);
System.out.print("lenght of arayy");
b=n.nextInt();
int arr[]=new int[b];
for(int i=0;i<b;i++)
{
arr[i]=n.nextInt();
}
System.out.print("array elements are");
for(int i=0;i<b;i++)
{
System.out.println(arr[i]);
}
System.out.print("enter element for searching");
s=n.nextInt();
System.out.print("element to be searched is"+s);
for(int i=0;i<b;i++)
{
if(s==arr[i])
{ 
System.out.println("found");
break;
}
else
{
System.out.println("not found");
break;
}
}
}
}

