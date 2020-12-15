
public class Mammal {

	private double weight;
	private int gestation;
	
	public Mammal() {
		this(1.2,12);
	}
	public Mammal(double weight) {
		this(weight,12);
	}
	public Mammal(int gestation) {
		this(1.200,gestation);
	}
	public Mammal(double weight,int gestation) {
		this.weight = weight;
		this.gestation = gestation;
	}
	
	public void lactate() {
		
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getGestation() {
		return this.gestation;
	}
	
	public void setGestation(int gestation) {
		this.gestation = gestation;
	}
	
}
