import java.util.*;

public class prgm1{
  public static void main(String[] args){
    Vector<String> cities=new Vector<>();
    cities.add("Mumbai");
    cities.add("Pune");
    cities.add("hyderabad");
    cities.add("Bangalore");
    cities.add("Chennai");

    System.out.println("Cities: "+cities);

    cities.remove(2);
    System.out.println("Cities: "+cities);
    cities.remove("Pune");
    System.out.println("Cities: "+cities);
     Collections.sort(cities);
    System.out.println("Cities: "+cities);
  }
}