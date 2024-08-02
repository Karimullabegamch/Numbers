import java.util.function.*;
public class PrediCate
  {
    public static void main(String[] args)
    {
      Predicate<Integer> p= s ->  s%5==0;
      System.out.println(p.test(3));

      Predicate<String> p1= str -> str.equals("begam");
      System.out.println(p1.test("mahi"));
      System.out.println(p1.test("begam"));
    }
  }

PREDICATE INTERFACE

  interface Predicate<T>
  {
    boolean test<T t>;
  }