package week1;
import java.util.Scanner;
public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double diameter;
		double cirumference;
		double area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.printf("Diameter is: %.2f%n",2 * radius);
        System.out.printf("Area is: %.2f%n", Math.PI * radius * radius);
        System.out.printf("Circumference is: %.2f%n",2.0 * radius * Math.PI);
	}

}
