import java.util.Scanner;
class Lexception{
    void lexception(){
        System.out.println("withdraw amount (Rs.) is not valid");
    }
}

class createacc{
    public void create(){
        String accountno;
        float balance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number");
        accountno=sc.next();
        System.out.println("Enter the amount to deposit");
        balance=sc.nextFloat();

    }
}
class User{
    String name;
    User(String s){
        name=s;
    }
class Account{
    String accountno;
    float balance;
    float amount;
    int found=0,k=0;
   
    Account(String a,float b){
      accountno=a;
      balance=b;

}
Account a[]=new Account[2];
void deposit(String accno,float amt){
    accountno=accno;
   
    amount=amt;
    System.out.println("The account balance is"+balance);
  for(int i=0;i<2;i++)
    if(accountno==accno){
        found=1;
        balance+=amt;
        k=i;
        break;
    }
    if(found==1){
     System.out.println("Balance is updated");
    System.out.println("The account balance is"+balance);}
    else{
        System.out.println("Account number does not exist");
    }
  }

void withdrawal(String accno,float amt){
    accountno=accno;
    amount=amt;
    Lexception le=new Lexception();
    if(balance<=500||accountno==accno){
        le.lexception();
    }
    else{
        if(accountno==accno){
            balance-=amount;
        }
    }
    


}
}
}






public class account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean opt=true;
        while(opt){
            System.out.println("1.Createaccno\n 2.Deposit\n 3.Withdraw");
        }
    }
    
}
