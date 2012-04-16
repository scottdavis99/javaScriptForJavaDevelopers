public class Person{
  private String name;
  private String city;
  
  public Person(String name, String city){
    this.name = name;
    this.city = city;
  }
  
  public String getName(){ return this.name; }
  public void setName(String name){ this.name = name; }
  
  public String getCity(){ return this.city; }
  public void setCity(String city){ this.city = city; }  
  
  public String toString(){
    return name + " lives in " + city;
  }
}