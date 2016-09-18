class Plant{
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
}
public class EncapsulationExample{
  public static void main(String[] args) {
    Plant plant=new Plant();
    plant.setName("Mango Tree");
    System.out.println(plant.getName());
  }
}
