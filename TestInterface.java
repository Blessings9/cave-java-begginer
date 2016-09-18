public class TestInterface{
  public static void main(String[] args){
  Bank bank1=new Bank();
  bank1.openAccount();
  People person1=new People("Mac");
  person1.goBank();

  Info info1=new Bank();
  info1.showInfo();
  Info info2=person1; // same as Info info2=new People(); info2.showInfo();
  info2.showInfo();

  // Or we can also access showInfo by doing this-

   accessShowInfo(bank1);
   accessShowInfo(person1);
   }
   private static void accessShowInfo(Info info){
     info.showInfo();
   }
}
