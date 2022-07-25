import java.util.Scanner;

class Account{
    String owner;
    double balance;
   String accountno;
   Account(String accno,String name,double bal)
   {
    this.owner=name;
    this.balance=bal;
    this.accountno=accno;
   }
   void deposit(double amount){
    this.balance+=amount;
    System.out.println("The Balance details");
    System.out.println(owner+"\t"+accountno+"\t"+balance);
   }
   void withdrawal(double amount){
    if(this.balance<500){
    System.out.println("less balance");
    return;
   }
   this.balance=amount;

}
}


public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the owner");
        String name=sc.next();
        System.out.println("Enter the accountno"); 
        String accountno=sc.next();
        System.out.println("Enter the balance");
        double balance=sc.nextDouble();
        Account a=new Account(accountno,name,balance);
        Boolean opt=true;
        while(opt){
            System.out.println("1.Balance\n 2.Deposit 3.withdrawl");
            System.out.println("enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter amount to deposit");
                double amt=sc.nextInt();
                a.deposit(amt);
                break;
                case 2:System.out.println("enter amount to withdrawal");
                double amount=sc.nextInt();
                a.withdrawal(amount);

            }break;
        }
        System.out.println("");
opt=sc.nextBoolean();
        }
    }

