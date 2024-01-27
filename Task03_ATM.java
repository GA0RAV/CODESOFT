// Task 3 - ATM INTERFACE 
// Account no - 123456
// Password - 123
import java.util.*;

class BankAccount 
{
    private double balance;
 
    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposit successful \nNew balance= " + balance+" Rs");
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful \nNew balance= " + balance+" Rs");
        } else 
        {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
}

class ATM 
{
    private BankAccount userAccount;
    private Scanner scanner;
    long accno,pass;
    public ATM(BankAccount userAccount,long acc, long pa) 
    {
        pass=pa;
        accno=acc;
        this.userAccount = userAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() 
    {
        System.out.println("\nATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void handleUserInput() 
    {
        while(true)
        {
            long acc,pa;
            System.out.print("\n Enter the account no =");
            acc=scanner.nextLong();
            System.out.print("\n Enter Pin =");
            pa=scanner.nextLong();

            if(pa==pass && accno==acc)
            {
                break;
            }
            else
            {
                System.out.print("\n Invallied username and password !!!!!!");
            }

        }
        int choice;
        do 
        {
            displayMenu();
            System.out.print("Enter your choice= ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Goodbye!...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again ");
                    break;
            }
        }while (choice != 4);
    }

    private void checkBalance() 
    {
        System.out.println("Current balance= " + userAccount.getBalance()+" Rs");
    }

    private void deposit() 
    {
        System.out.print("Enter the deposit amount= Rs.");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
    }

    private void withdraw() 
    {
        System.out.print("Enter the withdrawal amount= Rs.");
        double amount = scanner.nextDouble();
        userAccount.withdraw(amount);
    }
}

public class Task03_ATM
{
    public static void main(String[] args) 
    {
        BankAccount userAccount = new BankAccount(50000);
        ATM atm = new ATM(userAccount,123456,123);

        System.out.println("***********Welcome to the ATM***********");
        atm.handleUserInput();
    }
}
