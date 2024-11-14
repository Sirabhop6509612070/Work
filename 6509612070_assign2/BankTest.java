package core;

//สิรภพ สมเชย
//6509612070
import java.util.ArrayList;
import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		String choice="";
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		do {
		//while (!choice.equals("Q")) {
			System.out.println("Plese choose 1-5 or Q to quit");
			System.out.println("1 to add new account");
			System.out.println("2 to view specific account by index");
			System.out.println("3 to view specific account by balance");
			System.out.println("4 to add interest to all account");
			System.out.println("5 to see total and average money of all account");
			System.out.print("input:");
			choice = scan.nextLine();
			//int c =  Integer.parseInt(choice);
			//scan.nextLine();
			switch (choice) {
			case "1":
				System.out.print("Plese input balance:");
				double b = scan.nextDouble();
				scan.nextLine();
				Account a = new Account(b);
				bank.addAccount(a);
				System.out.printf("%n%n");
				break;
			case "2":
				System.out.print("Plese input index:");
				int index = scan.nextInt();
				scan.nextLine();
				System.out.printf("%n%n");
				Account account = bank.getAccount(index);
				System.out.printf("Account index:%d%n", index);
				System.out.printf("Account number:%d%n", account.getAccountNumber());
				System.out.printf("Account balance:%.0f%n", account.getBalance());
				System.out.printf("%n%n");
				break;
			case "3":
				System.out.print("Plese input balance(show any >= input):");
				double balance = scan.nextDouble();
				scan.nextLine();
				System.out.printf("%n");
				ArrayList<Account> arr = bank.findAccounts(balance);
				for (Account n : arr) {
					System.out.printf("Account number:%d%n", n.getAccountNumber());
					System.out.printf("Account balance:%.0f%n", n.getBalance());
					System.out.printf("%n");
				}
				Account min,max;
				min = bank.findMin();
				max = bank.findMax();
				System.out.println("Account with least amout of money:");
				System.out.printf("Account number:%d%n", min.getAccountNumber());
				System.out.printf("Account balance:%.0f%n", min.getBalance());
				System.out.printf("%n");
				System.out.println("Account with most amout of money:");
				System.out.printf("Account number:%d%n", max.getAccountNumber());
				System.out.printf("Account balance:%.0f%n", max.getBalance());
				System.out.printf("%n%n");
				break;
			case "4":
				System.out.println("Adding Interest");
				bank.addInterest();
				Account ac = bank.getAccount(0);
				for (int i = 0; i < ac.getLastAccountNumber(); i++) {
					ac = bank.getAccount(i);
					System.out.printf("Account balance:%.02f%n", ac.getBalance());
				}
				System.out.printf("%n%n");
				break;
			case "5":
				System.out.printf("All account total balance:%.2f%n", bank.getTotal());
				System.out.printf("Average between all account:%.2f%n", bank.getAverage());
				System.out.printf("%n%n");
				break;
			default:
				// System.out.println("Error wrong input");
				break;
			}
		} while (!choice.equals("Q"));

		scan.close();
	}
}
