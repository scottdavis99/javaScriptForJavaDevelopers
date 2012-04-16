public class JavaScope{  
  public static void main(String[] args) {
    String name = "Scott";
    for(int i=0;i<3;i++){
      // Will this work?
      String name = "Venkat";
      String message = name + " ate " + i + "cookies";
      System.out.println(message); 
    }
  }
}


