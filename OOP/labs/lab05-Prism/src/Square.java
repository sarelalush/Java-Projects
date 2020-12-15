
public class Square extends Shape2D {
	private double side;
	
	public Square() {
		this(5);
	}
	public Square(double side) {
		this.side = side;
	}
	public double area() {
		return (side*side);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
