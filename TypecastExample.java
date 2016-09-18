public class TypecastExample{
  public static void main(String[] args) {
    byte byteValue=34;
    short shortValue=89;
    int intValue=887;
    long longValue=43567;

    float floatValue=436.78f;
    double doubleValue=54473.34;

    // Will work.
    //longValue=intValue;
    //System.out.println(longValue);

    //Won't work
    //intValue=longValue;
    //System.out.println(intValue);
    intValue=(int) longValue;   //Will work.
    System.out.println(intValue);

    //Won't  work as we expeted.
    byteValue=(byte) longValue;
    System.out.println(byteValue+" Result is not as what we expeted.");

    //Won't  work as we expeted.
    byteValue=(byte) 128;
    System.out.println(byteValue+" Result is not as what we expeted.");

    intValue=(int)floatValue;
    System.out.println(intValue);


  }
}
