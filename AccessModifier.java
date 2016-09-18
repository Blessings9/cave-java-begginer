/**Here we are learning instance access modifier.
 *
 *Private----only within same class
 *public----From anywhere
 *protected----Same class,subclass, same package
 *No modifier(like: int variable)----same package only
 */


public class AccessModifier{
  public static void main(String[] args) {
    Vehicle vehicle=new Vehicle();
    System.out.println(vehicle.name);
    System.out.println(vehicle.TYRES);
    //Won't work because type is private.
    //System.out.println(vehicle.type);
    Bike bike=new Bike();
    System.out.println(bike.color);

  }
}
