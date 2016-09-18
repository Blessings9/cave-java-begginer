public class Robots{
  private int id;
  //Non static or nested inner class.
  private class Brain{
    public void think(){
      System.out.println("Robot "+id+" is thinking.");
    }
  }
  //Static inner class
  public static class Battery{
    public void charge(){
      System.out.println("Battery is charging...");
    }
  }
  public Robots(int id){
    this.id=id;
  }
  public void start(){
    System.out.println("Starting Robot "+id);
    Brain br=new Brain();
    br.think();
    //we can also declare class in a method.
    final String name="Robert";
    class Temp{
      public void doSomething(){
        System.out.println("My id is: "+id );
        System.out.println("My name is "+name);
      }
    }
    Temp temp=new Temp();
    temp.doSomething();
  }
}
