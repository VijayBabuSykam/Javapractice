class Employee{
  String name;
  int eid;
  int salary;
  String edept;
public static void main(String args[]){
  Employee emp1=new Employee();
  emp1.name="Vijay";
  emp1.eid=1234;
  emp1.salary=10000;
  emp1.edept="Software";
  Employee emp2=new Employee();
  emp2.name="Anuk";
  emp2.eid=146334;
  emp2.salary=100000;
  emp2.edept="Hardware";
  System.out.println(emp1.name+" "+emp1.eid+" "+emp1.salary+" "+emp1.edept);
  System.out.println(emp2.name+" "+emp2.eid+" "+emp2.salary+" "+emp2.edept);
  }
}