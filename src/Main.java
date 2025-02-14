import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*****************");
            System.out.println(" Banking Program ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        System.out.println("Thank you for using our Bank");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("Balance: " + balance);
    }

    static double deposit() {
        double amount = 0;

        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount <= 0) {
            System.out.println("Invalid amount");
            return 0;
        }else{
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount = 0;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("Invalid amount");
            return 0;
        }else if(amount < 0){
            System.out.println("Invalid amount");
            return 0;
        }else{
            return amount;
        }
    }
}