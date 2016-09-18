import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExcepHandleThree{
  public static void openFile() throws FileNotFoundException{
    File filename=new File("test.txt");
    FileReader reader=new FileReader(filename);
  }
  public static void main(String[] args) {
    ExcepHandleThree obj=new ExcepHandleThree();
    try{
      obj.openFile();
    }
    catch(FileNotFoundException e){
      System.out.println("File not found.");
    }
  }

}
