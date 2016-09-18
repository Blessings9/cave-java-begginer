//Use some java keywords: static,final.
class Student{
  String name;
  static int roll=0;
  static String college;
  public static final String COURSE="ENGG";
  public Student(String name){
    this.name=name;
    roll++;
    System.out.println("Student "+name+" roll number "+roll+ " is studying in "+college);
  }
  static void changeCollege(){
    college="RPSIT";
    System.out.println("Updated College.");
  }
  public void showInfo(){
    System.out.println(name+ " is Regular Student and studying in "+COURSE);
    //Not working because final variabl can't assign a value: COURSE="medical";
  }
}
public class StaticExample{
  public static void main(String[] args){
    Student.college="macet";
    Student s1=new Student("Raju");
    Student s2=new Student("Mahesh");
    Student.changeCollege();
    Student s3=new Student("Sonu");
    Student s4=new Student("Mohan");
    s3.showInfo();
    s4.showInfo();
  }
}
