package gr.aueb.cf.bankapp;


import gr.aueb.cf.bankapp.model.Account;
import gr.aueb.cf.bankapp.model.JointAccount;
import gr.aueb.cf.bankapp.model.OverdraftAccount;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an Account
        Account account = new Account(1, "GR123", "John", "Doe", "123-45-6789", 100.0);
        System.out.println("Initial account state: " + account.getAccountState());

        // Deposit 50.0 to the Account
        try {
            account.deposit(50.0);
            System.out.println("Account state after depositing 50.0: " + account.getAccountState());
        } catch (Exception e) {
            System.out.println("Error depositing to account: " + e.getMessage());
        }

        // Withdraw 75.0 from the Account
        try {
            account.withdraw(75.0, "123-45-6789");
            System.out.println("Account state after withdrawing 75.0: " + account.getAccountState());
        } catch (Exception e) {
            System.out.println("Error withdrawing from account: " + e.getMessage());
        }

        // Create a JointAccount
        List<String> users = Arrays.asList("Jane", "John");
        JointAccount jointAccount = new JointAccount(2, "GR456", 200.0, users);
        System.out.println("Initial joint account state: " + jointAccount.getAccountState());

        // Add a user to the JointAccount
        jointAccount.addUser("Bob");
        System.out.println("Joint account state after adding a user: " + jointAccount.getAccountState());

        // Remove a user from the JointAccount
        jointAccount.removeUser("Jane");
        System.out.println("Joint account state after removing a user: " + jointAccount.getAccountState());

        // Deposit 100.0 to the JointAccount
        try {
            jointAccount.deposit(100.0);
            System.out.println("Joint account state after depositing 100.0: " + jointAccount.getAccountState());
        } catch (Exception e) {
            System.out.println("Error depositing to joint account: " + e.getMessage());
        }

        // Withdraw 75.0 from the JointAccount
        try {
            jointAccount.withdraw(75.0, "123-45-6789");
            System.out.println("Joint account state after withdrawing 75.0: " + jointAccount.getAccountState());
        } catch (Exception e) {
            System.out.println("Error withdrawing from joint account: " + e.getMessage());
        }

        // Create an OverdraftAccount
        OverdraftAccount overdraftAccount = new OverdraftAccount(3, "GR789", "Jane", "Doe", "987-65-4321", 50.0, 100.0);
        System.out.println("Initial overdraft account state: " + overdraftAccount.getAccountState());

        // Set the credit limit of the OverdraftAccount
        overdraftAccount.setCreditLimit(200.0);
        System.out.println("Overdraft account state after setting credit limit: " + overdraftAccount.getAccountState());


        // Withdraw 75.0 from the OverdraftAccount
        try {
            overdraftAccount.withdraw(75.0, "987-65-4321");
            System.out.println("Overdraft account state after withdrawing 75.0: " + overdraftAccount.getAccountState());
        } catch (Exception e) {
            System.out.println("Error withdrawing from overdraft account: " + e.getMessage());
        }

        // Try to withdraw more than the credit limit from the OverdraftAccount
        try {
            overdraftAccount.withdraw(250.0, "987-65-4321");
            System.out.println("Overdraft account state after trying to withdraw more than credit limit: " + overdraftAccount.getAccountState());
        } catch (Exception e) {
            System.out.println("Error withdrawing from overdraft account: " + e.getMessage());
        }
    }
}

