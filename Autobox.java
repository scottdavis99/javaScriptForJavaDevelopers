public class Autobox{
  public static void main(String[] args){
    Integer a = 1;
    Integer b = 1;
    System.out.println(a == b);   //true
    
    Integer c = new Integer(1);
    Integer d = new Integer(1);
    System.out.println(c == d);   //FALSE!
    
    System.out.println(a == c);   //FALSE!

    // Even the assignment operator
    // can get trivially confused...
    Integer i = 0;
    int j = i;
    
    Integer k = null;
    j = k;  // Exception in thread "main" 
            //java.lang.NullPointerException            
  }
}




