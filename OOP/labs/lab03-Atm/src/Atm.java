
public class Atm {
	private Screen scr;
	private Keyboard kbd;
	private Db db;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm atm = new Atm( "myDatabase" );
		atm.go(); 
	}
	
	public Atm(String dbName) {
		this.db = new Db(dbName);
		this.scr = new Screen();
		this.kbd = new Keyboard();
	}
	

	private void goBalance() {
		System.out.println("Your balance is : "+db.getBalance());
	}
	
	private void goWithdrawal() {
		this.scr.displayWithdrawal();
		int withdrawalChoose = this.kbd.getnumber();

		switch(withdrawalChoose) {
			case 1:
				db.setBalance(this.db.getBalance()-20);
				break;
			case 2:
				db.setBalance(this.db.getBalance()-40);
				break;
			case 3:
				db.setBalance(this.db.getBalance()-60);
				break;
			case 4:
				db.setBalance(this.db.getBalance()-100);
				break;
			case 5:
				db.setBalance(this.db.getBalance()-200);
				break;
			default:
				break;
		}
		System.out.println("Your balance after Withdrawal : "+db.getBalance()+"$");
	}
	
	private void goDeposit() {
		System.out.printf("Deposit sum :");
		int depositFunds = this.kbd.getnumber();
		this.db.setBalance(this.db.getBalance()+depositFunds);
		System.out.println("Your balance after Deposit : "+db.getBalance()+"$");
	}
	
	public void go(){
		int account = 0 , choose = 0;
		boolean exit = true;
		String pass= "";
		scr.displayGreeting();
		scr.displayAcctPrompt();
		account = kbd.getAcct();
		scr.displayPwPrompt();
		pass = kbd.getPassword();
		if(db.verify(account, pass))
		{
			do
			{
				scr.displayMainMenu();
				choose = kbd.getnumber();
				switch (choose) {
				case 1: 
					goBalance();
					break;
				case 2:
					goWithdrawal();
					break;
				case 3:
					goDeposit();
					break;
				case 4:
					exit = false;
					break;
				default:
	
				}
			}while(exit);
		}
		System.out.println("Thanks! good bye :D1");
	}
}
