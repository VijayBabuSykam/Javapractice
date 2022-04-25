import java.util.Scanner;
class Twod{
  public static void main(String args[]){
    System.out.println("enter array elements :");
    int a[][]=new int[2][3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<2;i++){
      for(int j=0;j<3;j++){
      a[i][j]=sc.nextInt();
    }
      }
    System.out.println("the array elements are :");
    for(int i=0;i<2;i++){
      for(int j=0;j<3;j++){
      System.out.println(a[i][j]); 
    }
      }
   
  }
}
