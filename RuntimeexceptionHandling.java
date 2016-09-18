public class RuntimeexceptionHandling{

  public static void main(String[] args) {
      String[] text={"mango", "apple", "banana"};
      try{
        System.out.println(text[3]);
      }
      catch(Exception e){
        System.out.println("");
        System.out.println("This is a Runtime/Unchecked Exception handling, generally not use because java not force to handle it like Checked exception. ");
        System.out.println(e.toString());
      }
  }

}
