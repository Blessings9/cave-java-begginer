public class TestEnum{
  public static void main(String[] args) {
    Zoo animal=Zoo.ZEBRA;
    switch(animal){
      case ZEBRA:
        System.out.println("Zebra");
        break;
      case LION:
        System.out.println("Lion");
        break;
      case RHINO:
        System.out.println("Rhino");
        break;
      default:
        break;
    }
    System.out.println(Zoo.RHINO.getName());
    System.out.println(Zoo.RHINO);    //Accessing toString().
    System.out.println("Enum name as string: "+Zoo.RHINO.name());

    Zoo animal1=Zoo.valueOf("LION");
    System.out.println(animal1);

  }
}
