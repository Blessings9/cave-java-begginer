public class MultidimArray{
  public static void main(String[] args){
    int[][] grid={{2,4,8},{7,6},{3,7,1,9}};
    for(int row=0;row<grid.length;row++){
      for(int col=0;col<grid[row].length;col++){
        System.out.print(grid[row][col]+"\t");
      }
      System.out.println("");
    }
      String[][]words=new String[2][];
      words[0]=new String[3];
      words[0][1]="Hello zish";
      System.out.println(words[0][1]);
  }
}
