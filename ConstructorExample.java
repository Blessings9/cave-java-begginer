class Machine{
  String name;
  int code;
  public Machine(){
    this("jetley",6);
    System.out.println("Constructor is running.");

  }
  public Machine(String name, int code){
    System.out.println("Second Constructor is running.");
    this.name=name;
    this.code=code;
  }
}
public class ConstructorExample{
  public static void main(String[] args){
    new Machine();
    Machine machine1=new Machine("Chunkey", 4);
  }
}
