import java.util.Scanner;
class Negative{
  public static void main(String args[]){
    System.out.println("enter array elements :");
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("the negative elements are :");
    for(int i=0;i<5;i++){
      if(a[i]<0)
      {
    System.out.println(a[i]);
        }
  }
}
}