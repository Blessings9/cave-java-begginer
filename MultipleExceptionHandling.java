import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionHandling{
  public static void main(String[] args) throws IOException, ParseException {
    TestmultipleExceptionHandling obj=new TestmultipleExceptionHandling();
    //This is  First way for handling multiple exception.
    /*try{
      obj.run();
    }
    catch(IOException e){
      System.out.println("This is First way of handling multiple exception by, multiple catch block.");
      System.out.println("IO error.");
    }
    catch(ParseException e){
      System.out.println("This is First way of handling multiple exception by, multiple catch block.");
      System.out.println("Coudn't find command file.");
    }*/

    //This is  First way for handling multiple exception.
    /*try{
      obj.run();
    }
    catch(IOException | ParseException e){
      System.out.println("This is Second way of handling multiple exception, by one catch block.");
    }*/

    try{
      obj.run();
    }
    catch(Exception e){
      System.out.println("This is Third way of handling multiple exception, by one catch block.");
    }
  }
}
