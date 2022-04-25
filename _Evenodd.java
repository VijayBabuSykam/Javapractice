import java.util.Scanner;
class Evenodd
  {
    public static void main(String args[]){
      int num;
      System.out.println("enter the value:");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      if(num%2==0)
      {
        System.out.println("even");
      }
      else{
       System.out.println("odd");
    }
  }
  }