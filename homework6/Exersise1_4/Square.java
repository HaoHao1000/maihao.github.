package Exersise1_4;

public class Square extends Rectangle {
	public Square() {
		
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled) {
		super(color,filled,side,side);
	}
	public double getSide() {
		return super.getLength();
		// Vi hinh vuonng cd va cr bang nhau
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public void setWidth(double side) {
		setSide(side);
	}
	public void setLength(double side) {
		setSide(side);
	}
	public String toString() {
		return "Square[" + super.toString() + "]";
	}

}
