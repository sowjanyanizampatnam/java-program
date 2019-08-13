import java.util.Random;//write a java program for random numbers of different datatypes?
class random
{
public static void main(String [] args)
{
Random input=new Random();
System.out.println("random numbers in integer datatype is:"+input.nextInt());
System.out.println("random numbers in float datatype is:"+input.nextFloat());
System.out.println("random numbers in long datatype is:"+input.nextLong());
System.out.println("random numbers in short datatype is:"+input.nextShort());//error
System.out.println("random numbers in byte datatype is:"+input.nextByte());//error
}
}
