import java.util.Scanner;
class Vowel
  {
    public static void main(String args[]){
      char ch;
      System.out.println("enter an alphabet:");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) 
        {
        System.out.println("Vowel");
      }
      else{
       System.out.println("Consonent");
    }
  }
  }