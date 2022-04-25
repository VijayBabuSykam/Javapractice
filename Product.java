import java.util.Scanner;
class Product{
  public static void main (String args[]){
    int n,mul=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value :");
    n=sc.nextInt();
    while(n!=0){
      int rem=n%10;
      mul=mul*rem;
      n=n/10;
    }
    System.out.println(mul);
  }
}