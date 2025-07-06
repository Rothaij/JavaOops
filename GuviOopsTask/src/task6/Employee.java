package task6;

import java.util.Scanner;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    public int getAnnualSalary() {
        return salary * 12;
    }

    
    public int raiseSalary(int percent) {
        salary += (salary * percent) / 100;
        return salary;
    }

    
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();

       
        Employee emp = new Employee(id, firstName, lastName, salary);

        
        System.out.println("\nInitial Employee Details:");
        System.out.println(emp);

        
        System.out.print("\nEnter percentage to raise salary: ");
        int percent = scanner.nextInt();
        int newSalary = emp.raiseSalary(percent);

        
        System.out.println("\nUpdated Salary: " + newSalary);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Updated Employee Details: " + emp);

        
    }
}