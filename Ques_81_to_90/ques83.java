package Ques_81_to_90;

import java.util.*;
import java.util.stream.*;

// Java Stream API: Data Analysis

class Employee {
    private String name;
    private String department;
    private double salary;
    
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    // Getters
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class ques83 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 60000),
            new Employee("Bob", "IT", 75000),
            new Employee("Charlie", "HR", 65000),
            new Employee("David", "IT", 80000)
        );
        
        // Average salary by department
        Map<String, Double> avgSalaries = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        
        System.out.println("Average Salaries: " + avgSalaries);
    }
}


