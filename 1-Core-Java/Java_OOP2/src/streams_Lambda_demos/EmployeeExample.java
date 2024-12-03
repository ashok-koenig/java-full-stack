package streams_Lambda_demos;

import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return name + " salary is " + salary;
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 23433),
                new Employee("Peter", 45645),
                new Employee("Smith", 45654),
                new Employee("Bob", 67656)
                );

        System.out.println("Employees"+ employees);

        // Filter and print employees getting more than 50,000
        employees.stream().filter( emp-> emp.salary > 50000).forEach(System.out::println);
    }
}
