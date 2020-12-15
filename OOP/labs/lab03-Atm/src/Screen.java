public class Screen {

	public Screen() {
		
	}
	
	public void displayGreeting() {
		System.out.println("Welcome!");
	}
	public void displayAcctPrompt() {
		System.out.printf("Please enter your account number: ");
	}
	public void displayPwPrompt() {
		System.out.printf("Enter your PIN: ");
	}
	public void displayMainMenu() {
		System.out.println("Main menu");
		System.out.println("\t1 - View my balance");
		System.out.println("\t2 - Withdraw cash");
		System.out.println("\t3 - Deposit funds");
		System.out.println("\t4 - Exit");
		System.out.printf("Enter a choice:");
	}
	public void displayWithdrawal() {
		System.out.println("Withdrawal menu");
		System.out.printf("\t1 - $20");
		System.out.printf("\t4 - $100\n");
		System.out.printf("\t2 - $40");
		System.out.printf("\t5 - 200$\n");
		System.out.printf("\t3 - 60");
		System.out.printf("\t6 - Cancel transaction\n");
		System.out.printf("Choose withdrawal amount:");
	}
}
