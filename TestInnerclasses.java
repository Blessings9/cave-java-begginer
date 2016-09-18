public class TestInnerclasses{
  public static void main(String[] args) {
    Robots robo1=new Robots(7);
    robo1.start();
    //We can also access Brain class from outside like this but Brain class must be public..
    /*Robots.Brain brain=robo1.new Brain();
    brain.think();*/
    Robots.Battery battery=new Robots.Battery();
    battery.charge();

  }
}
