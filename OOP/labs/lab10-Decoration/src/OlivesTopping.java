import java.util.List;

public class OlivesTopping extends AbstractPizza{
	private IPizza base;
	private double price;
	
	public OlivesTopping(IPizza b,double price) {
		this.base = b;
		this.base.toppings().add("Olives");
		this.price = price;
	}

	@Override
	public int getSize() {
		return this.base.getSize();
	}

	@Override
	public List<String> toppings() {
		return this.base.toppings();
	}

	@Override
	public double howMuch() {
		return this.base.howMuch()+this.price;
	}
}
