public class JavaType{
  public static void main(String[] args){
    System.out.println(1 == 1);               //true
    System.out.println("Java" == "Java");     //true
    
    String lang = "Java";
    System.out.println("Java" == lang);       //true
    String anotherLang = new String("Java");
    System.out.println(anotherLang == lang);  //false (?!?)
  }  
}




