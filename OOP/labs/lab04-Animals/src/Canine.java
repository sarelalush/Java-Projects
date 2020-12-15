
public class Canine extends Mammal{

	private boolean vac;
	
	public Canine() {
		this(true);
	}
	
	public Canine(double weight,int gestation,boolean vac) {
		super(weight,gestation);
		this.vac = vac;
	}
	public Canine(boolean vac) {
		super();
		this.vac = vac;
	}

	public boolean isVac() {
		return vac;
	}

	public void setVac(boolean vac) {
		this.vac = vac;
	}
	public void wail() {
		
	}

}
