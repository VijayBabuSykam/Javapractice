import java.util.Scanner;
class Grades
  {
    public static void main(String args[])
    {
      float tot,per;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter physics marks:");
      int phy = sc.nextInt();
       System.out.println("enter chemistry marks:");
      int chem = sc.nextInt();
       System.out.println("enter biology marks:");
      int bio = sc.nextInt();
       System.out.println("enter mathematics marks:");
      int mat = sc.nextInt();
       System.out.println("enter computer marks:");
      int com = sc.nextInt();
      System.out.println("enter maximum marks:");
      float max = sc.nextInt();
      tot = phy+chem+bio+mat+com;
      per= (float)((tot / max)*100);
      if(per >= 90)
      {
         System.out.println("A grade");
      }
      else if (per >= 80)
      {
         System.out.println("B grade");
      }
        else if (per >= 70)
      {
         System.out.println("C grade");
      }
          else if (per >= 60)
      {
         System.out.println("D grade");
      }
            else if (per >= 50)
      {
         System.out.println("E grade");
      }
      else 
      {
        System.out.println(" Fail ");
      }
      }
  }