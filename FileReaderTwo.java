import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTwo{
  public static void main(String[] args) {
    String filename="/home/zish/Desktop/cave java/codes/reader";
    File file=new File(filename);
    BufferedReader br=null;
    try{
      FileReader fr=new FileReader(file);
       br=new BufferedReader(fr);
      String line;
      while((line=br.readLine())!=null){
        System.out.println(line);
      }
    }
    catch(FileNotFoundException e){
      System.out.println("File not found: "+file.toString());
      System.out.println("");
    }
    catch(IOException e){
      System.out.println("Unable to read file: "+file.toString());
    }
    try{
      br.close();
    }
    catch(IOException e){
      System.out.println("Unable to close file: "+file.toString());
    }
    catch(NullPointerException ex){
      //File was probably never opened.
    }
  }
}
