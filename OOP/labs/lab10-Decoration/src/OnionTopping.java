import java.util.List;

public class OnionTopping extends AbstractPizza{
	private IPizza base;
	private double price;
	
	public OnionTopping(IPizza p,double price) {
		this.base = p;
		this.base.toppings().add("Onion");
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
