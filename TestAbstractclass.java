public abstract class TestAbstractclass{
  public static void main(String[] args) {
    Mobile mobile=new Mobile();
    mobile.setId(3);
    SmartWatch sw=new SmartWatch();
    sw.setId(7);
    System.out.println(sw.getId());
    mobile.run();
    sw.run();
  }
}
