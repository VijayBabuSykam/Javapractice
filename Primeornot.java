import java.util.Scanner;
public class Primeornot{
  public static void main(String args[]){
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number :");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==2)
    {
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }
  }
}