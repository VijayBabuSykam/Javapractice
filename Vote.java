import java.util.Scanner;
class Vote 
  {
    public static void main(String arg[])
    {
    int age;
      System.out.println("enter the age :");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
     if(age>=18)
    {
      System.out.println("true");
    }
     else
    {
     System.out.println("false");
    }
      }
  }
  
