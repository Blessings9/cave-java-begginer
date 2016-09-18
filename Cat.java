class Cat extends Animal{
   void sleep(){
  System.out.println("Cat is sleeping.");
  }
  @Override
  public void eat(){
    System.out.println("Cat is eating.");
  }
  @Override
  public void run(){
    System.out.println("Cat is running.");
  }
  public void info(){
    System.out.println("Cat is a: " +animalType);
  }
}
