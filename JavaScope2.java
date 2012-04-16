public class JavaScope2{
  String name = "Scott";
  
  public static void main(String[] args) {
    JavaScope2 me = new JavaScope2();
    me.sayHello();
  }
  
  public void sayHello(){    
    System.out.println("Hello " + name);
    String name = "Venkat";
    System.out.println("Hello " + name);
  }
}