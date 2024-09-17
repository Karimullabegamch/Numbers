public class StringPal
  {
    public static void main(String[] arg)
    {
      String s="mam";
      String rev="";
    for(int i=s.length()-1;i>=0;i--)
      {
        rev=rev+s.charAt(i);
        
      }
      if(s.equals(rev))
      System.out.println("pal");
      else
        System.out.println("not pal");
    }
  }