import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratingCollections
  {
    public static void main(String[] args)
    {

      Vector<String> v=new Vector<String>();
      v.add("mahi");
      v.add("gayi");
      v.add("smith");

      System.out.println (" ===  standartd for loop forward ===");
      for(int i=0;i<v.size();i++)
       System.out.println(v.get(i));
       System.out.println (" ===  standartd for loop backward ===");
      for(int i=v.size()-1;i>=0;i--)
         System.out.println(v.get(i));
      System.out.println (" ===   for Each only forward ===");
      for(String ele:v)
        System.out.println(ele);

       System.out.println (" === iterator  only forward ===");
      Iterator<String> it=v.iterator();
      while(it.hasNext())
        System.out.println(it.next());
       System.out.println (" === List iterator  forward   ===");
      ListIterator<String> lit=v.listIterator();
      while(lit.hasNext())
        {
          System.out.println(lit.next());
        }

      System.out.println (" === List iterator  backward   ===");
      
      while(lit.hasPrevious())
        {
          System.out.println(lit.previous());
        }
      
       System.out.println (" === Enumeration iterator ===");

      Enumeration <String>  e=v.elements();
      while(e.hasMoreElements())
        System.out.println(e.nextElement());
      System.out.println (" === For each method  ===");
      v.forEach(i->System.out.println(i));

      System.out.println (" === method  refrerence ===");
      v.forEach(System.out::println);
    }
  }