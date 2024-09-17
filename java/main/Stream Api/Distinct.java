import java.util.*;
import java.util.stream.*;
public class Distinct
  {
    public static void main(String[] args)
    {
      List<Integer> l=Arrays.asList(3,3,4,2,2,4,5,2,2,5,6,9);
      System.out.println(l);

      l.stream().collect(Collectors.toSet()).forEach(x->System.out.print(x+" "));

      System.out.println();

    System.out.println("===DISTINCT==");
      l.stream().distinct().forEach(x->System.out.print(x+" "));
       System.out.println();

      List<String> sli=Arrays.asList("begam","mahi","gay","begam","gayi","mahi");

      System.out.println(sli);
       System.out.println("===DISTINCT==");
      sli.stream().distinct().forEach(x->System.out.print(x+" "));
       System.out.println();
      
    }
  }