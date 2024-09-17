//import java ;
public class SubstringPalindrome
  {
    public static void main(String[] args)
    {
      String s="malayalam";
      for(int i=0;i<s.length();i++)
        {
          for(int j=i+1;j<s.length();j++)
            {
              if(s.charAt(i)==s.charAt(j)) 
              {
                int x=j,f=1;
                for(int k=i;k<=j;k++)
                  {
                    if(s.charAt(k)!=s.charAt(x))
                    {
                      f=0;
                      break;
                    }
                    x--;
                  }
                if(f==1)
                {
                  for(int k=i;k<=j;k++)
                    {
                      System.out.print(s.charAt(k));
                    }
                  System.out.println();
                }
              }
            }
        }
    }
  }