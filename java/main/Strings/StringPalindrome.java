

public class StringPalindrome
  {
    public static void main(String[] args)
    {
      int f=1;
      String s="madam";
      for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i) == s.charAt(s.length()-1-i))
            f=1;
          else
          {
            f=0;
            break;
          }
        }
      if(f==1)
        System.out.println("pal");
      else
        System.out.println("not a pal");
    }
  }