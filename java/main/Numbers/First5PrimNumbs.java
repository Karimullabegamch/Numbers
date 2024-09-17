public class First5PrimNumbs
  {
    public static void main(String[] args)
    {
      int primeCount=0;
      for(int i=2;i<=100;i++)
        {
          int count=0;
          for(int j=2;j<i;j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
          if(count==0)
          {
            System.out.println(i);
            primeCount+=1;
          }
          if(primeCount==5)
          {
            break;
          }
        }
    }
  }