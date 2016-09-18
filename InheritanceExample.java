class InheritanceExample{
  public static void main(String[] args){
    Animal anim=new Animal();
    anim.eat();
    anim.run();
    Cat c=new Cat();
    c.sleep();
    c.eat();    //method overides.
    c.run();    //method overides.
    c.info();
  }
}
