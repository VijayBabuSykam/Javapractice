import java.util.Scanner;
class Program{
  public static void main(String args[]){
    System.out.println("enter array elements :");
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("the array elements are :");
    for(int i=0;i<5;i++){
    System.out.println(a[i]);
  }
}
}