class Frog{
  private String name;
  private int age;
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  /*public void setInfo(String name, int age){
    setName(name);   //here no need to add this keyword.
    setAge(age);     //here no need to add this keyword.
  }*/
}
public class SetterExample{
  public static void main(String[] args){
  Frog frog1=new Frog();
    //frog1.name="bertie"; // not useful because instance variable is now private.
    //frog1.age=1;          //not useful because instance variable is now private.
    frog1.setName("Bertie");
    frog1.setAge(1);
    //frog1.setInfo("Johny",2);
    System.out.println(frog1.getName());
    System.out.println(frog1.getAge());
  }
}
