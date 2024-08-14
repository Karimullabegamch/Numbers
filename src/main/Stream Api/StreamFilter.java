import java.util.*;
import java.util.stream.*;
public class StreamFilter
  {
    public static void main(String [] args)
    {
      List<Integer> l=new ArrayList<Integer>();
      l.add(3);
      l.add(4);
      l.add(33);
      l.add(40);
       System.out.println(l);
     
      System.out.println(l.stream());
       List<Integer> l1=l.stream().filter(x->x%2==0).collect(Collectors.toList());
      System.out.println(l1);

      System.out.println("WITHOUT STREAM");

      List<Integer> evenList=new ArrayList<Integer>();
      for(Integer i:l){
        if(i%2==0)
          evenList.add(i);
      }
      System.out.println(evenList);

      List<String> names=Arrays.asList("begam","mahi","gayi");

      List<String> names1=names.stream().filter(x->x.length()>4).collect(Collectors.toList());   
      System.out.println(names1);

      
      
    }
  }