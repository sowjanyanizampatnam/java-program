import java.util.*;//write a java program to give 3 parameters to display all the tokens in the given string & count the tokens?
class par3{
public static void main(String [] args)
{
StringTokenizer l=new StringTokenizer("sasi kumar ,gopi kumari"," ",true);
System.out.println("remaining tokens: "+l.countTokens());
while(l.hasMoreTokens())
{
System.out.println("tokens in the string:  "+l.nextToken());
System.out.println("remaining tokens: "+l.countTokens());
}
}
}