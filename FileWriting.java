import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
    public static void main(String[] args) {
      File file=new File("write");
      try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
        bw.write("This is first line.Using java file writer");
        bw.newLine();
        bw.write("This is second line.");
        bw.newLine();
        bw.write("This is third line.");
        System.out.println("File "+"'"+file+"'"+" has been created successfully.");
      }
      catch(IOException e){
        System.out.println("Unable to read file: "+file.toString());
      }
    }
}
