
public class Db {
	private String dbName;
	private int account;
	private String pass ;
	private int balance;
	
	public Db(String dbName) {
		this.dbName = dbName;
		this.account = 55652;
		this.pass = "123456";
		this.balance = 750;
	}
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		 this.balance = balance;
	}
	
	public boolean verify(int acct,String pw)
	{
		/*if (this.account == acct && this.pass == pw)
			return true;
		else 
			return false;*/
		return true;
	}
}
