import java.util.Scanner;
class Leapyear
  {
    public static void main(String args[]){
      int year;
      System.out.println("enter the year:");
      Scanner sc=new Scanner(System.in);
      year=sc.nextInt();
      if(year%4==0)
      {
        System.out.println("leap year");
      }
      else{
       System.out.println("non leap year");
    }
  }
  }