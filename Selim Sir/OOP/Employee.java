import java.util.Scanner;
class Employee {
    double salary;
    int work_hours_per_day;
    public void get_info() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble(); 
        System.out.print("Enter work hours per day: ");
        work_hours_per_day = scanner.nextInt();
    }
    public void add_sal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    public void add_work() {
        if (work_hours_per_day > 6) {
            salary += 5;
        }
    }
    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.get_info();
        employee.add_sal();
        employee.add_work();
        employee.printFinalSalary();
    }
}
