public class ArrayExample{
  public static void main(String[] args){
  // one type of array declaration.

    int[] values;
    values= new int[3];
    values[0]=10;
    values[1]=20;
    values[2]=30;
    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);
    //We can print above array by using loop also.
    for(int i=0;i<values.length;i++){
      System.out.println(values[i]);
    }

  // second type of array declaration.

    int[] value={3,6,9,12};
    for(int i=0;i<value.length;i++){
      System.out.println(value[i]);
    }
  }
}
