import java.util.*;
public class RandomClass
{
public static void main(String [] args)
  {
    Random r=new Random();
    int a=r.nextInt(4);
    System.out.println(a);
    int b=r.nextInt(2,5);
    System.out.println(b);
    }
}
