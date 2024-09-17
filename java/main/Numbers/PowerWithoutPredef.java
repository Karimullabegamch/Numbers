import java.util.Scanner;
public class PowerWithoutPredef
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int res=0;
      int pow=3;
      while(pow>0)
        {
          res=res+(num*num);
            pow--;
        
        }
      System.out.println(res);
    }
  }
