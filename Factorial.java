import java.util.Scanner;
public class Factorial{
  public static void main(String args[]){
    int mul=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number :");
   int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      mul=mul*i;
      }
        System.out.println(mul);
      }  
    }
