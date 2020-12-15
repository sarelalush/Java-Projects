import java.util.Scanner; 

public class Keyboard {
	Scanner s;
	public Keyboard() {
		 this.s = new Scanner( System.in );
	}
	
	public int getAcct() {
		
		return s.nextInt();
	}
	
	public String getPassword() {
		return s.next();
	}
	
	public int getnumber() {
		
		return s.nextInt();
	}
}
