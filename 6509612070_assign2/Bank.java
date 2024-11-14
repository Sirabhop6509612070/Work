package core;

//สิรภพ สมเชย
//6509612070
import java.util.ArrayList;

public class Bank {

	private static ArrayList<Account> accountList;

	public void addAccount(Account acct) {
		if(accountList!=null) {
		accountList.add(acct);
		}
		else {
			accountList = new ArrayList<Account>();
			accountList.add(acct);
		}
	}

	public Account getAccount(int index) {
		return accountList.get(index);
	}

	public ArrayList<Account> findAccounts(double amount) {
		if(accountList.isEmpty()) {
			return null;
		}
		ArrayList<Account> tmp= new ArrayList<Account>();
		for (Account a : accountList) {
			if (a.getBalance()>=amount) {
				tmp.add(a);
			}
		}
		return tmp;
	}

	public Account findMin() {
		if(accountList.isEmpty()) {
			return null;
		}
		Account min = accountList.get(0);
		for(Account a: accountList) {
			if(a.getBalance()< min.getBalance()) {
				min=a;
			}
			
		}
		return min;
	}

	public Account findMax() {
		if(accountList.isEmpty()) {
			return null;
		}
		Account max= accountList.get(0);
		for(Account a: accountList) {
			if(a.getBalance()> max.getBalance()) {
				max=a;
			}
			
		}
		return max;
	}

	public void addInterest() {
		accountList.forEach((a)->a.deposit(a.getBalance()*(0.03)));
	}

	public double getTotal() {
		double total=0;
		for(Account a: accountList) {
			total+=a.getBalance();
		}
		return total;
	}

	public double getAverage() {
		double average,total=0;
		int count=0;
		for(Account a: accountList) {
			total+=a.getBalance();
			count++;
		}
		average=total/count;
		return average;
	}
}
// for(Account a:accountList)
// for (int i = 0; i < accountList.size(); i++)
//accountList.forEach((a)->total+=a.getBalance())
// accountList