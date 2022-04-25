import java.util.Scanner;
public class Elseif
  {
    public static void main(String args[]){
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a character: ");
      ch=sc.next().charAt(0);
      if(ch=='a' || ch=='A')
      {
        System.out.println("Vowel");
        }
    else if(ch=='e' || ch=='E')
    {
      System.out.println("Vowel");
      }
      else if(ch=='i' || ch=='I')
      {
      System.out.println("Vowel");
        }
      else if(ch=='o' || ch=='O')
      {
        System.out.println("Vowel");
        }
      else if(ch=='u' || ch=='U')
      {
        System.out.println("Vowel");
        }
    else
        System.out.println("consonent");
     }
  }