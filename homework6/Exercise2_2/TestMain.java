package Exercise2_2;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + cylinder1.getRadius()
                + " height=" + cylinder1.getHeight()
                + " base area=" + cylinder1.getArea()
                + " volume=" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(10);
        System.out.println("Cylinder:"
                + " radius=" + cylinder2.getRadius()
                + " height=" + cylinder2.getHeight()
                + " base area=" + cylinder2.getArea()
                + " volume=" + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2, 10);
        System.out.println("Cylinder:"
                + " radius=" + cylinder3.getRadius()
                + " height=" + cylinder3.getHeight()
                + " base area=" + cylinder3.getArea()
                + " volume=" + cylinder3.getVolume());

        System.out.println(cylinder3);

        Circle circle1 = new Cylinder();
        System.out.println(circle1);
    }
	}

}
