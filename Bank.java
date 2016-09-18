public class Bank implements Info{
  private int accountNumber=112;
  public void openAccount(){
    System.out.println("Account opened.");
  }
  @Override
  public void showInfo(){
    System.out.println("Account Number is: "+accountNumber);
  }

}
