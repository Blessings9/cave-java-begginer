class Machine{
  public void start(){
    System.out.println("Machine started.");
  }
}
class Camera extends Machine{
  public void start(){
    System.out.println("Camera started.");
  }
  public void snap(){
    System.out.println("Photo is taken.");
  }
}
public class UpdowncastExample{
  public static void main(String[] args) {
    Machine machine=new Machine();
    Camera camera=new Camera();
    machine.start();
    camera.start();
    camera.snap();
    System.out.println("");

    /*-------Upcasting-------*/

    Machine machine1=camera;
    machine1.start();
    //wont work because snap() method is not overridden.
    //machine1.snap();

     System.out.println("");    

   /*-------Downcasting-------*/
   Machine machine2=new Camera();
   Camera camera1=(Camera)machine2;
   camera1.start();
   camera1.snap();
  }
}
