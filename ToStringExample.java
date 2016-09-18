class App{
  private int id;
  private String name;
  public App(int id, String name){
    this.id=id;
    this.name=name;
  }
  //Not efficiant but not wrong.
  /*public String toString(){
    return id+" "+name;
  }*/
  public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append(id).append(" ").append(name);
    return sb.toString();
  }

}
public class ToStringExample{
  public static void main(String[] args){
    App obj=new App(4,"cricket");
    System.out.println(obj);
  }
}
