import java.util.Scanner;
class BankAccount {
    private static int accountCounter = 1000;
    public String name;
    private String address;
    private String type;
    private double balance;
    private int transactions;
    public BankAccount(String name, String address, String type, double balance) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
        this.transactions = 0;
    }
    public String generateAccountNumber() {
        return "BA" + accountCounter++;
    }
    public void displayInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + type);
        System.out.println("Account Number: " + generateAccountNumber());
        System.out.println("Balance: " + balance);
        System.out.println("Total Transactions: " + transactions);
    }
    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            transactions++;
        }
    }
    public void changeAddress(String newAddress) {
        address = newAddress;
    }
    public int getTransactions() {
        return transactions;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine();
        BankAccount[] accounts = new BankAccount[numDepositors];
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Type of Account: ");
            String type = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            accounts[i] = new BankAccount(name, address, type, balance);
        }
        System.out.println("\nDepositor Information:");
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nDepositor " + (i + 1) + ":");
            accounts[i].displayInfo();
        }
        char choice = 'y';
        while (choice == 'y') {
            System.out.print("\nDo you want to change depositor information? (yes-y / no-n): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
            if (choice == 'y') {
                System.out.print("Enter the index of the depositor you want to select: ");
                int selectedDepositorIndex = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\nSelected Depositor Information:");
                accounts[selectedDepositorIndex - 1].displayInfo();
                System.out.println("\nOptions for Selected Depositor:");
                System.out.println("1. Change Address");
                System.out.println("2. Deposit Amount");
                System.out.println("3. Withdraw Amount");
                System.out.print("Enter the option number: ");
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("\nEnter new address for the selected depositor: ");
                        String newAddress = scanner.nextLine();
                        accounts[selectedDepositorIndex - 1].changeAddress(newAddress);
                        break;
                    case 2:
                        System.out.print("\nEnter amount to deposit for the selected depositor: ");
                        double depositAmount = scanner.nextDouble();
                        accounts[selectedDepositorIndex - 1].deposit(depositAmount);
                        System.out.println("\nDeposit successful.");
                        System.out.println("Total Transactions: " + accounts[selectedDepositorIndex - 1].getTransactions());
                        break;
                    case 3:
                        System.out.print("\nEnter amount to withdraw for the selected depositor: ");
                        double withdrawAmount = scanner.nextDouble();
                        accounts[selectedDepositorIndex - 1].withdraw(withdrawAmount);
                        System.out.println("\nWithdrawal successful.");
                        System.out.println("Total Transactions: " + accounts[selectedDepositorIndex - 1].getTransactions());
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                System.out.println("\nUpdated Information for the Selected Depositor:");
                accounts[selectedDepositorIndex - 1].displayInfo();
            }
        }
        System.out.println("\nThank you for using the banking system.");
    }
}