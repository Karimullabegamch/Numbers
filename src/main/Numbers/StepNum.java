import java.util.Scanner;

public class StepNum
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int r1=num%10;
      num=num/10;
      while(num>0)
        {
          int r2=num%10;
          if(r1-r2==1 || r2-r1==1) r1=r2;
          else 
          {
            System .out.println("not a step number");
           return ;
          }
          num=num/10;
          }
      System .out.println(" a step number");
      
        }
    }
    