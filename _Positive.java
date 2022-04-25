import java.util.Scanner;
class Positive
  {
    public static void main(String args[]){
      int num;
      System.out.println("enter the value:");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      if(num>=0)
      {
        System.out.println("positive");
      }
      else
      {
       System.out.println("negative");
    }
  }
  }