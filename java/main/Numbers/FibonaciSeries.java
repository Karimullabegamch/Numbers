
public class FibonaciSeries {
  public static void main(String[] args) {
   
    int a=0,b=1,c=0;
    for (int i = 1; i <= 5; i++) {
      System.out.print(a+" ");
      c=a+b;
      a=b;
      b=c;
    }
    
  }
}