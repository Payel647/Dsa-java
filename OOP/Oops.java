public class Oops{
  public static void main(String args[]){
   int nums[]={100,100,100};
   Student s4=new Student("mayel",25,nums);
   Student s5=new Student("ayel",35,nums);
   s4.roll=23;
   s4.name="demo";
   System.out.println(s5.name);
   System.out.println(s5.roll);
   Student s1=new Student("payel",45,nums);
   System.out.println(s1.name);
   s1.setName("koyel");
   System.out.println(s1.name);
   Student s2=new Student(s1);
   s1.marks[0]=3;
   System.out.println(s2.marks[0]);
   Cow an=new Cow();
   an.spoke();
   an.walk();
   an.color="white";
   System.out.println(an.color);
   Staff staff=new Staff();
   staff.walky();
    Hero me=new Hero();
    me.mero();
  }
}
interface Me{
  void mero();
}
class Hero implements Me{
  public void mero(){
    System.out.println("hi mero");
  }
}
abstract class Employe{
  abstract void walky();
}
class Staff extends Employe{
  void walky(){
    System.out.println("Hi i am walky");
  }
}
class Animal{
  String color;
  void spoke(){
    System.out.println("Hi");
  }
}
class Cow extends Animal{
  Cow(){
  super();
  }
  void walk(){
    System.out.println("Hi I am walking");
  }
  void spoke(){
    System.out.println("Hi i am child");
  }
}
class Student{
  String name;
  static int roll;
  int marks[];
  Student(String name, int roll,int marks[]){
    this.name=name;
    this.roll=roll;
    this.marks=marks;
  }
  void setName(String newName){
    this.name=newName;
  }
  Student(Student s1){
    this.name=s1.name;
    this.roll=s1.roll;
    this.marks=s1.marks;
  }
}
