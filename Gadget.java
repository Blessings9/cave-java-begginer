public abstract class Gadget{
  private int Id;
  public int getId(){
    return Id;
  }
  public void setId(int Id){
    this.Id=Id;
  }
  public abstract void start();
  public abstract void shutDown();
  public void run(){
    start();
    shutDown();
  }
}
