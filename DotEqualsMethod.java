class Lion{
  private int id;
  private String name;
  public Lion(int id, String name){
    this.id=id;
    this.name=name;
  }
}
public class DotEqualsMethod{
  public static void main(String[] args) {
    //Passing different name and id.
    Lion lion1=new Lion(14,"samrat");
    Lion lion2=new Lion(17,"raja");
    System.out.println(lion1==lion2);
    System.out.println(lion1.equals(lion2));
    //Passing same name and id.
    Lion lion3=new Lion(14,"samrat");
    Lion lion4=new Lion(14,"samrat");
    System.out.println(lion3==lion4);
    System.out.println(lion3.equals(lion4));

    String string1="hello";
    String string2="hello";
    System.out.println(string1==string2);
    System.out.println(string1.equals(string2));

    Double value1=8.9;
    Double value2=8.9;
    System.out.println(value1==value2);
    System.out.println(value1.equals(value2));

    Integer num1=7;
    Integer num2=7;
    System.out.println(num1==num2);
    System.out.println(num1.equals(num2));

  }
}
