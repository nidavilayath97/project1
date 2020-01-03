package entities;

public class Wallet {
	
	private String number;
	private String name;
	private double balance;
	
	
	public Wallet() {
		this ("","");
	    }
	
     public Wallet(String number, String name, double balance) {
	       this.number=number;
	       this.name=name;
	       this.balance=balance;
            }
     

	public Wallet(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addSalary(double salary) {
		balance=balance+salary;
	}
	
	@Override
	public String toString() {
		String display=""+number +""+name  +balance;
		return display;
	}
	
	public void transferAmount(Wallet b,double amount) {
		if(balance>amount) {
			b.balance=b.balance-amount;
		}
		
		if (balance<amount) {
			System.out.println("Insufficient balance");
		}
		}
	}
