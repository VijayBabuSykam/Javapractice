import java.util.Scanner;
class Casevowels{
  public static void main(String arg[])
    {
      char ch;
      System.out.println("enter the value: ");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      switch(ch)
        {
          case 'a':  case 'A':
        
           
            case 'e':  case 'E':
           
            case 'i':  case 'I':
            
            
            case 'o':  case 'O':
           
           
            case 'u':  case 'U':
            System.out.println("VOWEL");
            break;
            
          default:
            System.out.println("CONSONENT");
        }
    }
}