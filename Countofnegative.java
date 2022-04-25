import java.util.*;
class Countofnegative{
  public static void main(String args[]){
    int count=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array elements :");
    int a[]=new int[10];
    for(int i=0;i<10;i++){
      a[i]=sc.nextInt();
     }
    System.out.println("enter array elements :");
    for(int i=0;i<10;i++){
    if(a[i]<0){
      count++;
    }
  }
    System.out.println(count);
}
}