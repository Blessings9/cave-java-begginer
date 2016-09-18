class Robot{
  void speak(String text){
    System.out.println(text);
  }
  void jump(int height){
    System.out.println("Jumping height  "+height+" meter.");
  }
  void walk(String name, int distance){
  System.out.println("Robot "+name+" is walking "+distance+" meter.");
  }
}
  public class MethodParameter{
    public static void main(String[] args){
    Robot robo=new Robot();
    robo.speak("Hi i am a robo.");
    robo.jump(8);
    String name="Johny";
    int distance=7;
    robo.walk(name,distance);
  }

}
