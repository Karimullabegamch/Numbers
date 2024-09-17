import java.util.*;
import java.util.stream.*;
public class For{
  public static void main(String[] args)
  {

    int arr[]={1,2,4,5,6,4};
    System.out.println("USING STANDARD FOR LOOP");
    for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    System.out.println();
    System.out.println("using for each loop");
    for(int i:arr)
      {
        System.out.print(i+" ");
      }
    System.out.println();

    //arr.forEach(i->System.out.print(i+" "));

    // this foreach is used for only collections objects

    List<Integer> l=new ArrayList<Integer>();
    l.add(3);
    l.add(4);
    l.add(5);

    System.out.println("USING collection forEach loop");
  l.forEach(x-> System.out.print(x+" "));
    System.out.println();
   
  }
}