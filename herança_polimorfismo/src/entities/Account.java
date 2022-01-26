package entities;

public class Account {

	private Integer Number;
	private String Holder;
	protected Double Balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		Number = number;
		Holder = holder;
		this.Balance = balance;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}
	
	public void withdraw(double amount) {
		Balance -= amount;
	}
	
	public void deposit(double amount) {
		Balance += amount;
	}
	
}
