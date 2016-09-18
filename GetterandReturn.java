class Person{
  String name;
  int age;
  int retirementYearsLeft(){
    int yearsLeft=60-age;
    return yearsLeft;
  }
  int getAge(){
    return age;
  }
  String getName(){
    return name;
  }
}
public class GetterandReturn{
  public static void main(String[] args){
    Person person1=new Person();
      person1.name="joe";
      person1.age=37;
      int years=person1.retirementYearsLeft();
      System.out.println("The years of retirement left is "+ years);
      int age=person1.getAge();
      System.out.println("Actual age of person is "+age);
      String name=person1.getName();
      System.out.println("Name of person is "+name);
    }
}
