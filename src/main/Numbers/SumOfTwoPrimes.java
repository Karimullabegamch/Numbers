public class SumOfTwoPrimes
  {
    public static void main(String [] args)
    {
      int n=14;//n=16
      for(int i=1;i<=n;i++)
        {
          for(int j=i+1;j<=n;j++)//j=1;j<=n/2
            {

              if((i+j)==n)
              {
                 int c1=0,c2=0;
                for(int k=1;k<=i || k<=j;k++)
                  {
                    if(i%k==0)
                      c1++;
                    if(j%k==0)
                      c2++;


                  }
                if(c1==2 && c2==2)
                  System.out.println(i+" +"+j+" ="+n);
              }

            }
        }
    }
  }