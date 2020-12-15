
public class Cat extends Feline {
	
	private boolean spayed;
	
	public Cat () {
		this(true);
	}
	public Cat (boolean spayed) {
		super();
		this.spayed = spayed;
	}
	public Cat (double weight,int gestation, boolean spots,boolean spayed ) {
		super(weight,gestation,spots);
		this.spayed = spayed;
	}
	public boolean isSpayed() {
		return spayed;
	}

	public void setSpayed(boolean spayed) {
		this.spayed = spayed;
	}
	public void scratch() {
		
	}
	
}
