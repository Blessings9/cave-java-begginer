import java.util.Scanner;
public class UserInput{
  public static void main(String[] args){
    // Create Scanner object.
    Scanner input=new Scanner(System.in);
    //Output prompt.
    System.out.println("Enter a line of text: ");
    // Wait for user to enter a line of text.
    String line=input.nextLine();
    // Tell them what they entered.
    System.out.println("You Entered: "+line);

    //Output prompt.
    System.out.println("Enter an integer number: ");
    // Wait for user to enter an integer.
    int num=input.nextInt();
    // Tell them what they entered.
    System.out.println("You Entered: "+num);

    //Output prompt.
    System.out.println("Enter a floating number: ");
    // Wait for user to enter a float number.
    double value=input.nextDouble();
    // Tell them what they entered.
    System.out.println("You Entered: "+value);
  }
}
