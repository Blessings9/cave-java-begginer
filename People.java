public class People implements Info{
  private String name;
  public People(String name){
    this.name=name;
  }
  public void goBank(){
    System.out.println("Going to bank.");
  }
  @Override
  public void showInfo(){
    System.out.println("Name Of person is: "+name);
  }
}
