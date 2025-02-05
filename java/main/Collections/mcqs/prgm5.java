import java.util.*;
public class Test
{
      public static void main(String[] args) 
      {
           Map<String, Integer> map = new HashMap<String, Integer>();
           map.put("T", 1);
           map.put("M", 2);
           map.keySet().add("A",3);
           System.out.println(map.size());
     }
}