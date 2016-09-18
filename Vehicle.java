class Vehicle{
  // Bad practice to define public variable.
  int numbers;
  public String name;
  //Acceptable practice its final.
  public final static int TYRES=4;
  private String type;
  protected String color;
  public Vehicle(){
  this.name="Bus";
  this.type="four wheeler";
  this.color="Green";
  }
}
