import java.io.Serializable;
//Serialization example code.

public class Laptop implements Serializable{
    private int id;
    private String name;
    public Laptop(int id, String name){
      this.id=id;
      this.name=name;
    }
    @Override
    public String toString(){
      return "Laptop [id="+ id + ", name=" + name+"]";
    }
}
