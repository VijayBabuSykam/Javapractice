import java.util.Scanner;
class Sumofnatural{
  public static void main (String args[]){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value :");
    n=sc.nextInt();
    int i=0;
    while(i<=n){
      sum=sum+i;
      i++;
    }
    System.out.println(sum);
  }
  
}