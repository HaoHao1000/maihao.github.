package Exersise1_4;

public class Circle extends Shape {
	private double radious = 1.0;

	public Circle(String color, boolean filled, double radious) {
		super(color, filled);
		this.radious = radious;
	}
	public Circle() {
		
	}
	public Circle(double radius) {
		radius = this.radious;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
	public double getArea() {
		return Math.PI * getRadious() * getRadious();
	}
	public double getPerimeter() {
		return 2 * Math.PI * radious;
	}
	@Override
	public String toString() {
		return "Circle" + super.toString()+  "[radious=" + radious + "]";
	}
	

}
