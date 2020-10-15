package entities;

public class Data {
	
	private int account;
	private String name;
	private double balance;
	
	public Data(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		dataDeposit(initialDeposit);
	}
	public int getAccount() {
		return account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void dataDeposit(double deposit) {
		balance += deposit;
	}
	public void dataWithdraw(double withdraw) {
		balance -= (withdraw + 5.00); 
	}
	public String toString() {
		return "ACCOUNT "
				+ account
				+ ", HOLDER: "
				+ name
				+ ", BALANCE: $"
				+ String.format("%.2f", balance);
	}
}
