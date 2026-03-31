import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}

public class Main {
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

        //find out employee with highest salary
        Employee highestSalary = empList.stream()
                .max((a,b) -> Double.compare(a.getSalary(),b.getSalary())).orElse(null);
                System.out.println("Employee with highest salary: " + 
                highestSalary.getName() + " - " + highestSalary.getSalary());
                // Employee highestSalary = empList.stream()
                //.max((a,b) -> (int)a.getSalary(),(int)b.getSalary());

                Employee lowestsallary=empList.stream().min((e1,e2)->
                Double.compare(e1.getSalary(),e2.getSalary())).orElse(null);
                System.out.println("Employee with lowest salary: " +
                lowestsallary.getName() + " - " + lowestsallary.getSalary());

                //remove duplicate employee based on id
                ArrayList<Employee> distinctEmployees = empList.stream()
                .filter(distinctByKey(e -> e.getId()))
                .collect(Collectors.toCollection(ArrayList::new));
                System.out.println("Distinct Employees based on ID:");
                distinctEmployees.forEach(e -> System.out.println(e.getId() + " " + e.getName()));


                  //skip firt 2 youngest and print next 2 employee
                System.out.println("Next 2 Youngest Employees after skipping first 2:");
                empList.stream()
                .sorted((e1,e2) -> Integer.compare(e1.getAge(),e2.getAge()))
                .skip(2)
                .limit(2)
                .forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));
                //print 3 employee with lowest salary in IT department
                System.out.println("3 Employees with lowest salary in HR Department:");
                empList.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .sorted((e1,e2) -> Double.compare(e1.getSalary(),e2
                   .getSalary()))
                .limit(3)
                .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
            //remove duplicate employee name and print the first 5 employee
            System.out.println("First 5 Employees with distinct names:");
            empList.stream()
            .filter(distinctByKey(e -> e.getName()))
            .limit(5)   
            .forEach(e -> System.out.println(e.getId() + " " + e.getName()));
            
           

    }

}