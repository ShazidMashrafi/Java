class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
}
class Employee extends Member {
    private String specialization;
    public Employee(String name, int age, String phoneNumber, 
    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    public void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Specialization: " + specialization);
    }
}
class Manager extends Member {
    private String department;
    public Manager(String name, int age, String phoneNumber, 
    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    public void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Shazid", 30, "1234567890", "Trishal", 50000, "Software Engineer");
        Manager manager = new Manager("Mashrafi", 40, "0987654321", "Dhaka", 80000, "Developer");
        employee.displayInfo();
        employee.printSalary();
        System.out.println();
        manager.displayInfo();
        manager.printSalary();
    }
}