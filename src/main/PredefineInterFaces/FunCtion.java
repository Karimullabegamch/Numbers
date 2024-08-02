import java.util.function.*;

public class FunCtion {
  public static void main(String[] args) {
    Function<String, Boolean> f = str -> str.equals("mahi");
    System.out.println(f.apply("begam"));
    System.out.println(f.apply("mahi"));
  }}

FUNCTION INTERFACE
  

  interface Function<T R>
  {
    R apply(T t);
    
  }