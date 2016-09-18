import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects{
  public static void main(String[] args) {
    System.out.println("Writing objects....");
    Laptop dell=new Laptop(234,"Dell");
    Laptop hp=new Laptop(543,"Hp");
    System.out.println(dell);
    System.out.println(hp);
    try(FileOutputStream fs=new FileOutputStream("gadget.bin")){
      ObjectOutputStream os=new ObjectOutputStream(fs);
      os.writeObject(dell);
      os.writeObject(hp);
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
    System.out.println("Successfully Serialized.");
  }
}
