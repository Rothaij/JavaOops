package task6;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		String inputName = scanner.nextLine();

		System.out.print("Enter age: ");
		int inputAge = scanner.nextInt();

		Person person = new Person(inputName, inputAge);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

	}
}