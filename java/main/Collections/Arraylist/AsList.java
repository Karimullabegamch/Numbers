import java.util.*;

public class AsList
  {
    public static void main(String[] args)
    {
      List<String> li=Arrays.asList("mahi","gayi","smith");
      System.out.println(li);
      Collections.sort(li);
      System.out.println(li);
      Collections.reverse(li);
       System.out.println(li);
        
    }
  }