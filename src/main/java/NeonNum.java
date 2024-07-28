import java.util.Scanner;
public class NeonNum
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int sq=num*num;
      int sum=0;
     while(sq>0)
        {
         
            sum=sum+sq%10;
          sq=sq/10;
          
        }
      if(sum==num)
      {
        System.out.println("Neon num");
      }
      else{
        System.out.println("Not Neon num");
      }
    }
  }
//9=9*9=81; 8+1=9;