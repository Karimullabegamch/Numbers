import java.util.*;
 
public class FrequencyInArrayList
  {
    public static void main(String[] args)
    {
      ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(3);
      al.add(3);
      al.add(4);
      al.add(5);
      for(Integer i:al)
        System.out.println(i);
      Set<Integer> s=new HashSet<Integer>(al);
       System.out.println("set");
      for(Integer i:s)
        System.out.println(i);
       System.out.println("arraylist");
       System.out.println(al);

      List< List<Integer> > li=new ArrayList<>();
      for(Integer i:s)
        {
          ArrayList<Integer> freq=new ArrayList<Integer>();
          int c=Collections.frequency(al,i);
          freq.add(i);
          freq.add(c);
          li.add(freq);
          
          
        }
      System.out.println(li);
        

      
    }
  }


input === [3, 3, 4, 5]
output == [[3, 2], [4, 1], [5, 1]]