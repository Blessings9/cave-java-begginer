import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExcepHandleOne{
  public static void main(String[] args) throws FileNotFoundException {
     File filename=new File("textfile.txt");
     FileReader reader= new FileReader(filename);
  }
}
