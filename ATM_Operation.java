import java.util.*;
class ATM
  {
    int balance;
    //withdraw
    void withdraw(int amt){
      if(balance>amt){
        balance=balance-amt;
        System.out.println("Withdraw Successful");
      }
      else
      {
        System.out.println("Insufficient funds");
      }
    }
    //deposit
    void deposit(int amt){
      balance=balance+amt;
      System.out.println("Deposit Successfull");
    }
    //CheckBalance
    void CheckBalance(){
      System.out.println(balance);
    }
  }
class ATM_Operation
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      ATM atm=new ATM();
      atm.balance=10000;
      char ch='y';
      do{
        System.out.println("1.Withdraw\n 2.Deposit\n 3.CheckBalance");
        System.out.println("Select option");
        int option=sc.nextInt();
        switch(option){
          case 1:
            System.out.println("Enter amount");
            int amount=sc.nextInt();
            atm.withdraw(amount);
            break;
          case 2:
            System.out.println("enter amount");
            int amount1=sc.nextInt();
            atm.deposit(amount1);
            break;
          case 3:
            atm.CheckBalance();
            break;
          default:
            System.out.println("Invalid option");
        }
        System.out.println("Do you want to continue");
        ch=sc.next().charAt(0);
      }
        while(ch=='y');
    }
  }