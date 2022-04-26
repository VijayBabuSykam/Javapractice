/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class HighestNumber {
  //Add main method
  public static void main(String args[])
    {
     

//Use the scanner class to provide input at execution time
    Scanner sc = new Scanner(System.in); 
      System.out.println("Enter first number :");
      int a = sc.nextInt();
      System.out.println("Enter second number :");
      int b = sc.nextInt();
      System.out.println("Enter third number :");
      int c = sc.nextInt();
      if(a>b){
      if(a>c){
        System.out.println(a+" is highest number");
      }
      else{
        System.out.println(c+" is highest number");
      }
      }
    else{
      if(b>c){
        System.out.println(b+" is highest number");
      }
      else{
        System.out.println(c+" is highest number");
      }
      }
    }
  }


//check which number is highest using if else condition

//Print the highest of three numbers
 


// very good
