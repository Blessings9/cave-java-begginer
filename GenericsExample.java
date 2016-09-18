import java.util.*;
public class GenericsExample{
    public static void main(String[] args) {

      // Before java 1.5 java collection framework was non-generic so we then type cast needed.
      //////Old Style///////
      ArrayList list=new ArrayList();
      list.add("Apple");
      list.add("Mango");
      list.add("Banana");
      list.add("Guava");
      String fruit=(String)list.get(1);
      System.out.println(fruit);

      // But since 1.5 is Generic so no need of type cast.
      //////Modern Style///////
      ArrayList<String> strings=new ArrayList<String>();
      strings.add("Lion");
      strings.add("Rhino");
      strings.add("Bear");
      String animal=strings.get(1);
      System.out.println(animal);



    }
}
