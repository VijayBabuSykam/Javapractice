import java.util.Scanner;
class Animal
  {
    String color;
    void eat()
    {
     System.out.println("Eating");
    }
  }
class Dog extends Animal{
  String bread;
  void bark(){
    System.out.println("Barking");
  }
}
class Single_Inheritance
  {
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      Dog d=new Dog();
     String c,b;
      System.out.println("enter the color of dog :");
      c=sc.next();
      
      System.out.println("enter the breed of dog :");
      b=sc.next();
      System.out.println("color of dog is :"+c);
      System.out.println(" the breed of dog :"+b);
      
      
      d.eat();
      d.bark();
      
    }
  }