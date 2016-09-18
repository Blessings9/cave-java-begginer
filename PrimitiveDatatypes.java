public class PrimitiveDatatypes{
  public static void main(String[] args){
    byte myByte=127;               //Size: 1 byte, Range:	-128 to 127
    short myShort=881;            //Size: 2 byte, Range: -32768 to 32767
    int  myInt=8472;             //Size: 4 byte, Range: -2,147,483,648 to 2,147,483, 647
    long myLong=987648823;           //Size: 8 byte, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    float myFloat=324.356f;    //Size: 4 byte, Range: approximately ±3.40282347E+38F(6-7 significant decimal digits)
    double myDouble=26756.674767; //Size: 8 byte, Range: approximately ±1.79769313486231570E+308(15 significant decimal digits)

    char myChar='z';          //Size: 2byte, Range: 0 to 65,536 (unsigned)
    boolean myBoolean=false; //Size:it represents one bit information but size not precisely defined, Range: true or false

    System.out.println(myByte);
    System.out.println(myShort);
    System.out.println(myInt);
    System.out.println(myLong);
    System.out.println("");
    System.out.println(myFloat);
    System.out.println(myDouble);
    System.out.println("");
    System.out.println(myChar);
    System.out.println(myBoolean);
  }
}
