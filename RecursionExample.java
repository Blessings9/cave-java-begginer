public class RecursionExample{
  public int factorial(int value){
    //System.out.println(value);
    if(value==1){
      return 1;
    }
    return factorial(value-1)*value;
  }
  public static void main(String[] args) {
    RecursionExample obj=new RecursionExample();
    System.out.println(obj.factorial(8));
  }
}
