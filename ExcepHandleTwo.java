import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExcepHandleTwo{
  public static void main(String[] args){
  //String name="/home/zish/Desktop/cave java/codes/reader";
  File filename=new File("text.txt");
    try{
      FileReader reader=new FileReader(filename);
      //This block will run if exception not thrown.
      System.out.println("Continuing...");
    }
    catch(FileNotFoundException e){
      //This block of code will run if exception thrown.
      System.out.println("File is not found: "+filename.toString());
      System.out.println("Finished.");
    }
  }
}
