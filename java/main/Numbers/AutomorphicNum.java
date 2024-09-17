import java.util.Scanner;

public class AutomorphicNum {
  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int temp=num;
      int digCount=0;
      while(num>0)
        {
          num=num/10;
          digCount+=1;
        }
 // System.out.println(Math.pow(10,digCount)+" "+((temp*temp)%(10*digCount)));
      if(temp==((temp*temp)%Math.pow(10,digCount)))
      {
        System.out.println("Automorphic num");
      }
      else{
        System.out.println("Not Automorphic  num");
      }
    }
}

// 5=5*5=25;

// 25=25*25=625;