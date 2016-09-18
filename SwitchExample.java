import java.util.Scanner;
public class SwitchExample{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter a command.");
    String text=scanner.nextLine();
    switch(text){
    case "start":
      System.out.println("Machine Satarted.");
       break;
    case "stop":
       System.out.println("Machine Stoped.");
       break;
    default:
    System.out.println("Command not recognised.");
    }

  }
}
