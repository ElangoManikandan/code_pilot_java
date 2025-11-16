package Tasks.BankingSystem;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account loggedIn = null;

        while (true) {
            System.out.println("\n----- BANK SYSTEM -----");
            System.out.println("1. Login Account");
            System.out.println("2. Register Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    loggedIn = Auth.login();
                    if (loggedIn != null) {
                        loggedInMenu(loggedIn, sc);
                    }
                    break;

                case 2:
                    Auth.register();
                    break;

                case 3:
                    System.out.println("Thank you for using the Banking System!");
                    return;

                default:
                    System.out.println("Invalid input. Try again!");
            }
        }
    }

    private static void loggedInMenu(Account acc, Scanner sc) {
        while (true) {
            System.out.println("\n--- ACCOUNT MENU ---");
            System.out.println("Account Holder: " + acc.getName());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);
                }

                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    acc.withdraw(amount, password);
                }

                case 3 -> {
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    double balance = acc.getBalance(password);
                    if (balance >= 0) {
                        System.out.println("Current Balance: Rs." + balance);
                    }
                }

                case 4 -> {
                    System.out.println("Logged out successfully.");
                    return;
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
