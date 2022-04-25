import java.util.Scanner;
class Days{
  public static void main(String arg[])
    {
      int n;
      System.out.println("enter the value: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      switch(n)
        {
          case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
          default:
            
        }
    }
}