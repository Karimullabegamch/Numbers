import java.util.*;
import java.util.stream.*;

public class StreamFlatMap{
  public static void main (String[] args)
  {
    List<Integer> l=new ArrayList<Integer>();
    l.add(3);
    l.add(4);
    l.add(5);
    System.out.println(l);

    List<Integer> l1=Arrays.asList(2,4,5,6,7);
    System.out.println(l1);

    List<List<Integer>> l2=new ArrayList<List<Integer>>();
     l2.add(Arrays.asList(3,2,14,5));
    l2.add(Arrays.asList(1,2,4,5,5,6));
    l2.add(Arrays.asList(3,4,2));
    System.out.println(l2);

    System.out.println("flatmap is used to convert nested collection to normal collection");
   List<Integer> l3=l2.stream().flatMap(x->x.stream()).collect(Collectors.toList());
    System.out.println(l3);
  }
}