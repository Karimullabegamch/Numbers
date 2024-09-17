import java.util.function.*;

public class SupppLier {
  public static void main(String[] args) {

    Supplier<String> s=() -> "begam";
    System.out.println(s.get());

    
  }
}

SUPPLIER INTERFACE 

  interface Supplier<T>
  {
    T get();
  }