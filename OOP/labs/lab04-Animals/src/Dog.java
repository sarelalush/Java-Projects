public class Dog extends Canine{

	private String name ;
	private int fleas;
	
	public Dog() {
		this("Asaf",5);
	}
	public Dog(String name , int fleas) {
		super();
		this.name = name;
		this.fleas = fleas;
	}
	public Dog(String name , int fleas ,boolean vac) {
		super(vac);
		this.name = name;
		this.fleas = fleas;
	}
	public Dog(double weight,int gestation,boolean vac,String name , int fleas) {
		super(weight,gestation,vac);
		this.name = name;
		this.fleas = fleas;
	}
	public void bark() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFleas() {
		return fleas;
	}
	public void setFleas(int fleas) {
		this.fleas = fleas;
	}
}
