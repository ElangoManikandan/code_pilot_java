package Tasks.EmployeeSalaryCalculator;

public class Employee {
    String name;
    String designation;
    int basicSalary;
    Employee(String name,String designation,int basicSalary){
        this.name=name;
        this.designation=designation;
        this.basicSalary=basicSalary;
    }
    int calculateSalary(int basicSalary){
        return basicSalary+1000;
    }
    double calculateSalary(double bonus){
        return basicSalary+bonus;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee: "+name+"\n Designation: "+designation+"\n Salary without bonus :"+basicSalary+"\n Salary with bonus : "+(int) (calculateSalary(4000.0)));
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Kavin","Developer",31000);
        e1.displayEmployeeDetails();
    }
}
