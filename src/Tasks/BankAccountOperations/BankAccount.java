package Tasks.BankAccountOperations;

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    private double balance;
    BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }

    void deposit(double amount){
        balance=amount+balance;
        System.out.println("Deposited: "+amount);
        System.out.println("Available Balance:"+balance);
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdrawn: "+amount);
        System.out.println("Available Balance:"+balance);
    }
    double checkBalance(){
        return balance;
    }
    void setBalance(int amount){
        balance=amount;
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12345", "Rahul");
        System.out.println("Account Created: " + b1.accountNumber + "- " + b1.accountHolderName);
        b1.deposit(5000);
        b1.withdraw(2000);
        System.out.println(b1.checkBalance());
    }
}
