class Machine{
  public void start(){
    System.out.println("Machine starting.");
  }
}
public class AnonymousclassExample{
  public static void main(String[] args) {
    Machine machine=new Machine(){  //This is a Annonymous class and a child class of Machine
      public void start(){          // start()  method overridden.
        System.out.println("Annonymous machine is started.");
      }
    };
    machine.start();
  }
}
