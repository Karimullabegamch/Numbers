import java.util.*;

public class capacity
  {
    public static void main(String [] args){
      Vector<Integer> v=new Vector<>(2,9);
      System.out.println("Initial capacity is: "+v.capacity());
      for(int i=0; i<10;i++)
        {
          v.add(i);
        }
      System.out.println("Capacity after adding elements is: "+v.capacity());
      v.add(4);
      System.out.println("Capacity after adding elements is: "+v.capacity()); 

    v.forEach(System.out::print);
      System.out.println();
      System.out.println(Collections.max(v));
      System.out.println(Collections.min(v));
     Collections.reverse(v);
      v.forEach(System.out::print);
      System.out.println();
    }
  }