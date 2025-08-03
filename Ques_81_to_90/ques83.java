package Ques_81_to_90;

import java.util.*;
import java.util.stream.*;

// Java Stream API: Data Analysis

class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getDepartment() { 
        return department; 
    }
    
    public double getSalary() { 
        return salary; 
    }
    
    // Optional toString() for debugging
    @Override
    public String toString() {
        return name + " (" + department + "): $" + salary;
    }
}

public class ques83 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 60000),
            new Employee("Bob", "IT", 75000),
            new Employee("Charlie", "HR", 65000),
            new Employee("David", "IT", 80000)
        );
        
        // Analysis 1: Average salary by department
        Map<String, Double> avgSalaries = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        
        // Analysis 2: Department counts
        Map<String, Long> deptCounts = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
            ));
        
        System.out.println("Employees: " + employees);
        System.out.println("Average Salaries: " + avgSalaries);
        System.out.println("Department Counts: " + deptCounts);
    }
}


