import java.util.*;
import java.util.stream.*;

class Prgm1
  {
    public static void main(String [] args)
    {
      List<String> l=new ArrayList<String>();
      l.add("begam");
      l.add("mahi");
      l.add("gayi");

      System.out.println("==== 1 ====");
      System.out.println(l);
      System.out.println("==== 2 ====");

      for(String s:l)
        System.out.println(s);

      System.out.println("==== 3 ====");

      Stream<String> s=l.stream();
      s.forEach(i->System.out.println(i));
    }
  }