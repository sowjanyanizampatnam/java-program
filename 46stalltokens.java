import java.util.*;//write a java program to display all tokens in the given  string?
class token{
public static void main(String [] args)
{
StringTokenizer l=new StringTokenizer("ku ma r");
while(l.hasMoreTokens())
{
System.out.println("tokens in the string: "+l.nextToken());
}
}
}
