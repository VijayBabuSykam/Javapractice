import java.util.Scanner;
class Palindrome{
  public static void main (String args[]){
    int n,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value :");
    n=sc.nextInt();
    int temp=n;
    while(n!=0){
      int rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
    if(rev==temp){
    System.out.println("Palindrome");
  }
    else{
      System.out.println("Not Palindrome");
    }
    }
}