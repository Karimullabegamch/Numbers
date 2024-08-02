public class InstanceVar {
  int x=100;

  void meth1()
  {
    System.out.println(x);
    System.out.println(this.x);
    InstanceVar obj=new InstanceVar();
    System.out.println(obj.x);
  }
  public static void main(String[] args) {

    InstanceVar obj=new InstanceVar();
    System.out.println(obj.x);
    obj.meth1();
    obj.x=99;
     System.out.println(obj.x);
    obj.meth1();
  }}
