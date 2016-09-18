class StringbuilderExample{
  public static void main(String[] args){
  //Not efficiant way.
  String info="";
  info="Hey my name is John";
  info +=" ";
  info +="and I am a builder.";
  System.out.println(info);

  //More efficiant way is-
  StringBuilder sb=new StringBuilder("");
  sb.append("Hey my name is Joe");
  sb.append(" ");
  sb.append("and I am a swimmer. ");
  System.out.println(sb.toString());
  StringBuilder s=new StringBuilder("");
  s.append("Hello")
  .append(" there. ")
  .append("This is Mac.");
  System.out.println(s.toString());

  //Formatting...
  System.out.println("This is a general text, \t but this is tab text.\n And this is new line text. ");
  System.out.println("This is more text.");
  //Formatting integers.
  int count=0;
  System.out.printf("Total Quantiy: %5d\nTotal cost: %5d\n", 5,15);
  for(int i=0;i<=5;i++){
  System.out.printf("Total Quantiy: %5d Total Cost: %5d\n", i,i*13);
  count++;
  }
  //Formatting integers and String.
  System.out.printf("%5d: %s\n", count,"Number");
  System.out.printf("This is floating number formatting: %f and add\n",5.7);
  System.out.printf("Here it will display 2 number but we can get any number after decimal by adding number like .3 or any : %.2f\n",5.7);

  }
}
