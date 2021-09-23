import java.util.Scanner;
class Account
{
    String nam;
    String account;
    double balance;
    double rate;
    String cont;
    String address;
    Account()
    {
        rate=9.05;
        balance=0;

        Scanner sc =  new Scanner(System.in);
        System.out.print("Nam:");
        nam=sc.nextLine();
        System.out.print("cont:");
        cont=sc.nextLine();
        System.out.print("Account No.:");
        account=sc.nextLine();
        System.out.print("address:");
        address=sc.nextLine();
        System.out.print("------------------------\n");

    }
    void deposit(double money)
    {
        balance+=money;
        display();
    }
    void withdraw(double money)
    {
        if(balance<money)
            System.out.println("Balance too less");
        else
            balance-=money;
        display();
    }
    void interest()
    {
        balance += (balance*rate/1000);
        display();
    }
    void display()
    {
        System.out.println("Balance: \n"+balance  );
    }
}
//function  to be performed
class Banking
{
    public static void main(String args[])
    {
        int ch=0;
        Account a=new Account();
        Scanner sc =  new Scanner(System.in);
        while(ch!=5)
        {
            System.out.println(" 1. Account creation \n 2. Deposit\n 3. Withdraw\n " +
                    "4. Compute  Interest\n 5. Display balance\n 6. Exit");
            System.out.print("choice:");
            ch = sc.nextInt();
            switch(ch)

            {
                case 1: System.out.println("*your account is created*");break;
                case 2: System.out.print("Enter amount for deposit:"); a.deposit(sc.nextDouble()); break;
                case 3: System.out.print("Enter amount of withdrawal:"); a.withdraw(sc.nextDouble()); break;
                case 4: a.interest(); break;
                case 5: a.display(); break;
                case 6: System.out.print("Exiting");
                    break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}
