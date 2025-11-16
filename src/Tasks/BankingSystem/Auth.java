package Tasks.BankingSystem;

import java.util.Scanner;

public class Auth {
    private static Account[] accounts = new Account[10];
    private static int count = 0;

    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (accounts[i].getName().equals(name)) {
                System.out.println("User already exists!");
                return;
            }
        }

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (count < accounts.length) {
            accounts[count] = new Account(name, password, 0);
            count++;
            System.out.println("Account created successfully.");
            System.out.println("Returning to main menu...");
        } else {
            System.out.println("Account limit reached!");
        }
    }

    public static Account login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your registered name: ");
        String name = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        for (int i = 0; i < count; i++) {
            // FIXED: use .equals() instead of ==
            if (accounts[i].getName().equals(name) && accounts[i].checkPassword(password)) {
                System.out.println("Login successful!");
                return accounts[i];
            }
        }

        System.out.println("Invalid username or password.");
        return null;
    }

    public static void showUsers() {
        if (count == 0) {
            System.out.println("No users registered.");
        } else {
            System.out.println("\nRegistered Users:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + accounts[i].getName());
            }
        }
    }
}
