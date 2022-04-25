class Student{
  String name;
  int rollno;
  String branch;
public static void main(String args[]){
  Student st1=new Student();
  st1.name="Vijay";
  st1.rollno=1234;
  st1.branch="ECE";
  Student st2=new Student();
  st2.name="Anuk";
  st2.rollno=1456;
  st2.branch="CSE";
  System.out.println(st1.name+" "+st1.rollno+" "+st1.branch);
  System.out.println(st2.name+" "+st2.rollno+" "+st2.branch);
  }
}