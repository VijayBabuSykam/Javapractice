import java.util.Scanner;
class Sumofdigits{
  public static void main (String args[]){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value :");
    n=sc.nextInt();
    while(n!=0){
      int rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println(sum);
  }
}