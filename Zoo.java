public enum Zoo{
  ZEBRA("Larry"), LION("Samrat"), RHINO("Jimmy");
  private String name;
  Zoo(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public String toString(){                   //Genarally not use in enum but here using it for test purpose.
    return "This animal is called: "+name;
  }
}
