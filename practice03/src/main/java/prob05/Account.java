package prob05;

public class Account {
	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance() {
		this.balance = balance;
	}

	public void save(int i) {
		System.out.println(accountNo + "계좌에 " + i + "만원이 입금되었습니다.");
		balance = balance + i;

	}

	public void deposit(int j) {
		System.out.println(accountNo + " 계좌에 " + j + "만원이 출금되었습니다.");
		balance = balance - j;
	}

}