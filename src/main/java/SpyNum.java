import java.util.Scanner;
public class SpyNum
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int sum=0;
      int prod=1;
      for(;num>0;num=num/10)
        {

          int r=num%10;
            sum=sum+(r);
            prod=prod*(r);
      }
    
      if(sum==prod)
      {
        System.out.println("Spy num");
      }
      else{
        System.out.println("Not Spy num");
      }
    }
  }