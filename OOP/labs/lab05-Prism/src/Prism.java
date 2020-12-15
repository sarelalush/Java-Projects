
public class Prism {
	private double height;
	private Shape2D base;
	
	public Prism() {
		this(new Circle(),2);
		
	}
	public Prism(Shape2D base,double height) {
		this.height = height;
		this.base = base;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Shape2D getBase() {
		return this.base;
	}
	public void setBase(Shape2D base) {
		this.base = base;
	}
	
	public double volume() {
		return (this.base.area() * this.height);
	}
}
