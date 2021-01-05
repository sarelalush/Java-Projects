
public abstract class AbstractPizza implements IPizza{
	@Override
	public String toString() {
		String str ="";
	    str = String.format("Pizza: size = %d; Price = %f; Toppings: ",getSize(),howMuch());
		for (String t:toppings()) {
			str+=t.toUpperCase()+", ";
		}
		return str;
	}
}
