public class Circle extends Shape2D{
	private double radius;
	
	public Circle() {
		this(3.14);
	}
	public Circle(double radius) {
		 this.radius = radius;
	}	
	
	public double area(){
		return Math.PI*(this.radius*this.radius);
	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
