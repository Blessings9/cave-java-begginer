import java.io.IOException;
import java.text.ParseException;

public class TestmultipleExceptionHandling{
  public void run() throws IOException, ParseException{
    //throw new IOException("error");
    throw new ParseException("This is a test error message. \n error at line: ",2);
  }
}
