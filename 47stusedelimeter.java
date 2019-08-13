import java.util.*;//write a java program to display the tokens as seperated by ":"(delimeter)?
class tokens{
public static void main(String [] args)
{
StringTokenizer l=new StringTokenizer("sasi:kumar:sasi:kumari",":");
while(l.hasMoreTokens())
{
System.out.println("tokens in the string:  "+l.nextToken());
System.out.println("remaining tokens: "+l.countTokens());
}

}
}