import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    n = sc.nextInt();
    if(n%2==0){
      System.out.println("even number");
    }
    else
    {
       System.out.println("odd number");
    }
  }
}