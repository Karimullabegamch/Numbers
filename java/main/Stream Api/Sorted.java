import java.util.*;
import java.util.stream.*;

public class Sorted
  {
    public static void main(String [] args)
    {
      List<Integer> li=new ArrayList();
      li.add(3);
      li.add(4);
      li.add(1);
      li.add(7);
      
       List<Integer> sli=li.stream().sorted().collect(Collectors.toList());
      sli.forEach(n->System.out.println(n));

      List<String> names= Arrays.asList("begam","zahi","gayi");
      names.stream().sorted().collect(Collectors.toList()).forEach(name-> System.out.println(name));

    //  List<String> names1= Arrays.asList("begam","zahi","gayi");
      
      
      
    
    }
  }