import java.util.*;
public class BankAccount {
    double balance;
    int  accountnumber;
    static int amount;
    static double wid_amo;
    Scanner sc =new Scanner(System.in);

    public BankAccount(double balance ) {
        this.balance = balance;

    }
    public void acc_num(int accountnumber){
        this.accountnumber=accountnumber;

    }


    public void deposit(int amount) {
        System.out.println("Enter the deposit amount");
        amount=sc.nextInt();
        if (amount > 0) {

            balance = balance + amount;
            System.out.println("deposited:"+amount);
            System.out.println("new balance:"+balance);
        }
    }
    public void widraw(double wid_amo)
    {
        System.out.println("Enter the Withdraw amount");
        wid_amo=sc.nextInt();
        balance=balance-wid_amo;
        if (wid_amo>0 && balance>wid_amo)
        {

            System.out.println("windrawed:"+wid_amo);
            System.out.println("remain balance:"+balance);


        }
    }

    public static void main(String[] args) {
        BankAccount bk = new BankAccount(20000);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Account number");
        int accountnumber =sc.nextInt();
        bk.acc_num(accountnumber);
        System.out.println("choose between option 1:deposit option 2 :withdraw ");
        int option = sc.nextInt();
        switch (option)
        {
            case 1 :{
                bk.deposit(amount);
            }
            case 2 :{

                bk.widraw(wid_amo);
            }
        }





    }
}