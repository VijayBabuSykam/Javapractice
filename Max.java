import java.util.*;
class Max{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array elements :");
    int a[]=new int[10];
    for(int i=0;i<10;i++){
      a[i]=sc.nextInt();
     }
    int max=a[0];
    System.out.println("enter array elements :");
    for(int i=0;i<10;i++){
    if(a[i]>max){
      max=a[i];
    }
  }
    System.out.println(max);
}
}