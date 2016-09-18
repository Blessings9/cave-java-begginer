public class IfconditionExample{
  public static void main(String[] args){
    int loop=0;
    while(loop<10){
      System.out.println("Looping "+loop);
      if(loop==5){
        break;
      }
      loop++;
      System.out.println("Running");
    }
    System.out.println("End of loop");
  }
}
