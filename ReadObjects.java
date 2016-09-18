import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects{
  public static void main(String[] args) {
    System.out.println("Reading objects....");
    try(FileInputStream fi=new FileInputStream("gadget.bin")){
      ObjectInputStream os=new ObjectInputStream(fi);
      Laptop laptop1=(Laptop)os.readObject();
      Laptop laptop2=(Laptop)os.readObject();
      os.close();
      System.out.println(laptop1);
      System.out.println(laptop2);
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
    catch(ClassNotFoundException e){
      e.printStackTrace();
    }
  }
}
