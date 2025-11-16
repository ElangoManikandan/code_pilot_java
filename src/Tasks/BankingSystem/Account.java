package Tasks.BankingSystem;

public class Account {
     private String name;
     private String password;
    private double balance;

    Account(String name,String password,double balance){
        this.balance=balance;
        this.name=name;
        this.password=password;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public double getBalance(String userpassword){
        if(checkPassword(userpassword)){
            return balance;
        }
        else {
            System.out.println("Incorrect password!");
            return -1;
        }
    }

    public String getName(){
        return name;
    }
    void setBalance(double amount){
        balance=amount;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: Rs."+amount);
        }else{
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount,String inputPassword){
        if(!checkPassword(inputPassword)){
            System.out.println("Incorrect Password");
        }else if(amount>balance){
            System.out.println("Insufficient Funds!");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawn: Rs."+amount);
        }
    }
}

