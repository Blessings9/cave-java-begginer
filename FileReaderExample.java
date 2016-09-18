import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReaderExample{
  public static void main(String[] args) throws FileNotFoundException{
    String filename="/home/zish/Desktop/cave java/codes/reader";            //Address of file.
    File textfile=new File(filename);
    Scanner input=new Scanner(textfile);
    while (input.hasNextLine()) {
      String read=input.nextLine();
      System.out.println(read);
    }
    input.close();
  }
}
