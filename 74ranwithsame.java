import java.util.Random;//print same seed value using randomclass?
class seed
{
public static void main(String [] args)
{
Random seed=new Random(100);
System.out.print("random numbers generated are:"+seed.nextInt()+"and"+seed.nextInt());
}
}
//random numbers generated are:-1193959466 and -1139614796