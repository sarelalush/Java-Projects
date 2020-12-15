public class Leopard extends Feline{
	private int mates;

	public Leopard() {
		super();
		mates = 5;
	}
	public Leopard(int mates , boolean spots) {
		super(spots);
		this.mates = mates;
	}
	public Leopard(double weight,int gestation, boolean spots,int mates) {
		super(weight,gestation,spots);
		this.mates = mates;
	}
	
	public int getMates() {
		return mates;
	}

	public void setMates(int mates) {
		this.mates = mates;
	}
	
	public void roar() {
		
	}
	public void prey () {
		
	}
}
