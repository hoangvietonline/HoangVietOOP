package baitap2;

public class AcountBank {
	private static Banking banking = new  Banking();
	public void deposit(float money) {
		banking.setMoneySystem(banking.getMoneySystem() + money);
		System.out.println("Balance in the account : " + banking.getMoneySystem());
	}
	public void withdraw(float money) throws BankingException {
		if (money > banking.getMoneySystem()) {
			throw new BankingException("The amount to be withdrawn is greater than the amount in the account!");
		}else {
			banking.setMoneySystem(banking.getMoneySystem() - money);
			System.out.println("Balance in the account : " + banking.getMoneySystem());
		}
	}
	public void printMenu() {
		System.out.println("ATM");
		System.out.println("1 . Deposit");
		System.out.println("2 . Withdraw");
	}
}
