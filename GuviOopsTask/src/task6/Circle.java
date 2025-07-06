package task6;

import java.util.Scanner;

public class Circle {

	private double radius;

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public void display() {
		System.out.println("Radius: " + radius);
		System.out.println("Circumference: " + getCircumference());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Circle defaultCircle = new Circle();
		System.out.println("Circle with default radius:");
		defaultCircle.display();

		System.out.print("\nEnter radius for custom circle: ");
		double inputRadius = scanner.nextDouble();

		Circle userCircle = new Circle(inputRadius);
		System.out.println("Circle with user-provided radius:");
		userCircle.display();

		scanner.close();
	}
}