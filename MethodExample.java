class Car{
  String name;
  int speed;
  void start(){
    System.out.println("The car " +name+ " is running at speed of " +speed+ " Kmph");
  }
  /*void break(){
    System.out.println("Now the car " +name+ " is stopped");
  } */
}
public class MethodExample{
  public static void main(String[] args){
    Car car1=new Car();
      car1.name="Honda";
      car1.speed=60;
      car1.start();
  }
}
