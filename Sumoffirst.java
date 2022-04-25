import java.util.Scanner;
class Sumoffirst{
  public static void main (String args[]){
    int n,first,last,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value :");
    n=sc.nextInt();
    first =n;
    last =n%10;
    while(n>=10){
      n=n/10;
     }
    first=n;
    sum = first + last;
    System.out.println(sum);
  }
}