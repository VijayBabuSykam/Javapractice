import java.util.*;
class Sumofeven{
  public static void main(String args[]){
    int sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array elements :");
    int a[]=new int[10];
    for(int i=0;i<10;i++){
      a[i]=sc.nextInt();
     }
    System.out.println("enter array elements :");
    for(int i=0;i<10;i++){
    if(a[i]%2==0){
      sum=sum+a[i];
    }
  }
    System.out.println(sum);
}
}