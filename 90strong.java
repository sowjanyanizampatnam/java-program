import java.util.*;//write a program for check whether  the given number is strong or not?
class stnum{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);

System.out.println("enter ur num");
int d=s.nextInt();
int a,sum=0,r;
a=d;
while(d!=0)
{
r=d%10;
int f=1;
for(int i=1;i<=r;i++)
f=f*i;
sum=sum+f;
d=d/10;
}
if(a==sum)
{
System.out.println(a+"is a strong number");
}
else
System.out.println(a+"is not a strong number");
}
}
