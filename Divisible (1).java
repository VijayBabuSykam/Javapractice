import java.util.*;
class Divisible{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array elements :");
    int a[]=new int[10];
    for(int i=0;i<10;i++){
      a[i]=sc.nextInt();
     }
    System.out.println("enter array elements :");
    for(int i=0;i<10;i++){
    if(a[i]%5==0){
      System.out.println(a[i]);
    }
  }
}
}