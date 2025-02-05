import java.util.*;
 public class BufferTest
{
   public static void main(String [] args)
   {
        Map<Integer,String> map = new HashMap<>();
  map.put(128,"Ampt");
  map.put(new Integer(128),"Hyd");
  System.out.println(map.size());
    }
 }