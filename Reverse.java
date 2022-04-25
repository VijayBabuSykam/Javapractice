import java.util.Scanner;
public class Reverse{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n;
    System.out.println("enter i value :");
    n=sc.nextInt();
    int i=n;
    while(i>=0)
    {
  System.out.println(i);
    i--;
    }
  }
}