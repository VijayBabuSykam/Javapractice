import java.util.Scanner;
class Firstandlast{
  public static void main (String args[]){
    int n,first,last;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value :");
    n=sc.nextInt();
    first =n;
    last =n%10;
    while(n>=10){
      n=n/10;
     }
    first=n;
    System.out.println(first +" "+ last);
  }
}