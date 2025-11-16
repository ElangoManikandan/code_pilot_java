package Tasks.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Elango", "IT", 72000, 5),
                new Employee(2, "Karthik", "Finance", 48000, 3),
                new Employee(3, "Meena", "HR", 52000, 4),
                new Employee(4, "Ravi", "IT", 90000, 8),
                new Employee(5, "Priya", "Marketing", 45000, 2),
                new Employee(6, "Suresh", "IT", 55000, 6),
                new Employee(7, "Anitha", "Finance", 78000, 9),
                new Employee(8, "Deepak", "IT", 60000, 7),
                new Employee(9, "Lakshmi", "HR", 47000, 2),
                new Employee(10, "Naveen", "Sales", 51000, 3),
                new Employee(11, "Divya", "Marketing", 62000, 5),
                new Employee(12, "Arjun", "IT", 49500, 3),
                new Employee(13, "Vignesh", "Finance", 67000, 7),
                new Employee(14, "Gayathri", "IT", 83000, 9),
                new Employee(15, "Rahul", "Operations", 40000, 1),
                new Employee(16, "Harini", "HR", 53000, 5),
                new Employee(17, "Kavin", "Sales", 59000, 6),
                new Employee(18, "Preethi", "Finance", 85000, 10),
                new Employee(19, "Manoj", "Marketing", 56000, 4),
                new Employee(20, "Shreya", "IT", 94000, 10)
        );
//        employees.stream().forEach((e)->{
//            System.out.println("ID:"+e.getId()+" Name: "+e.getName()+" Dept: "+e.getDepartment()+" Salary: "+e.getSalary()+" "+e.getExperience()+"years");
//        });
        List<Employee> filtered_employees=employees.stream()
                .filter(e->e.getSalary()>50000)
        .filter(e->e.getDepartment()
                .equalsIgnoreCase("IT"))
                .collect(Collectors.toList());
        filtered_employees.forEach((e)->{
            System.out.println("ID:"+e.getId()+" Name: "+e.getName()+" Dept: "+e.getDepartment()+" Salary: "+e.getSalary()+" Experience: "+e.getExperience()+" years");
        });
        Double avg=filtered_employees.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
        System.out.println("Average: "+avg);

//        Double averageSalary=filtered_employees.stream()
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .orElse(0.0);
//        System.out.println(averageSalary);

        Map<String,Long> deptCount=employees
                .stream()
                .collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
        Double totalSalary=employees
                .stream()
                        .collect(Collectors.summingDouble(e->e.getSalary()));
        System.out.println("Total People Salary:" + totalSalary);
//        deptCount.forEach((dept,count)->{
//            System.out.println("Dept: "+dept+ " : Count: "+count);
//        });
//        Long EmployeeCount=employees.stream().collect(Collectors.counting());
//        System.out.println(EmployeeCount);

    }
}
class Employee
{
    private long id;
    private String name;
    private String department;
    private double salary;
    private int experience;

    Employee(long id,String name,String department,double salary,int experience){
        this.department=department;
        this.id=id;
        this.name=name;
        this.experience=experience;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }
}