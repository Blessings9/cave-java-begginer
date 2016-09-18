import java.util.Scanner;
public class DowhileExample{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

  /*  System.out.println("Enter a number: ");
    int value=scanner.nextInt();
    while(value!=5){
    System.out.println("Enter a number: ");
    value=scanner.nextInt();
    }
    System.out.println("Got "+value+"!");
    */
    int value=0;
    do{
      System.out.println("Enter number 5: ");
      value=scanner.nextInt();
    }
    while(value!=5);
      System.out.println("Got "+value+"!");
  }
}
