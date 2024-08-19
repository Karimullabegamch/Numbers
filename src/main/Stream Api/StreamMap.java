import java.util.*;
import java.util.stream.*;
public class StreamMap
  {
    public static void main(String [] args)
    {
      List<Integer> l=new ArrayList<Integer>();
      l.add(3);
      l.add(4);
      l.add(5);
      l.stream().map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);
    }
  }

