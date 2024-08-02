import java.util.function.*;

public class ConSumer {
  public static void main(String[] args) {
    Consumer<String> c = str -> System.out.println(str);
    c.accept("mahi");

  }}

CONSUMER INTERFACE

  interface Consumer<T> {
    void accept(T t);
}