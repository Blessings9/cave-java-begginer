class Plant{
  int length=10;
  public void grow(){
    System.out.println("Plant growing");
  }
}

 class Tree extends Plant{
   int length=5;
  public void grow(){
      System.out.println("Tree growing.");
  }
  public void shadeLeaves(){
    System.out.println("Shedding leaves.");
  }
}
public class PolymorphismExample{
  public static void main(String[] args) {
    Plant plant1=new Plant();
    Tree tree=new Tree();
    Plant plant2=tree;
     tree.grow();
     plant2.grow();
     //Won't work because shadeLeaves method not overridden.
    // plant2.shadeLeaves();
     System.out.println(plant2.length); //Output is 10 beacuse, Runtime polymorphism can't be achieved by data members.
  }
}
