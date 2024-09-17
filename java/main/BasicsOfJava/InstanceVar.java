public class InstanceVar {
  int x=100;

  void meth1(InstanceVar obj)
  {
    System.out.println(x+obj.x);
    System.out.println(this.x);
    InstanceVar obj1=new InstanceVar();
    System.out.println(obj1.x);
  }
  public static void main(String[] args) {

    InstanceVar obj=new InstanceVar();
    System.out.println(obj.x);//100
    obj.meth1(obj);//200 ,100,100,
    obj.x=99;
     System.out.println(obj.x);//99
    obj.meth1(obj);//198,99,100
  }}


 In instance variable once object is created and modified that value so that modified value will be continued upto we created a new object