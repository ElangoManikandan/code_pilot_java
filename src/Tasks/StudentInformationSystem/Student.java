package Tasks.StudentInformationSystem;

public class Student {
    String name;
    int rollNo;
    String department;
    int mark;
    Student(String name,int rollNo,String department,int mark){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
        this.mark=mark;

    }
    String calculateGrade(int mark){
        if(mark>=90){
           return "A";
        } else if (mark>=75) {
            return  "B";
        }else if(mark>=60){
            return "C";
        }else{
            return "Fail";
        }
    }
    void displayDetails(){
        System.out.println("Name: "+name+"\n Roll no: "+rollNo+"\n Department: "+department+"\n Marks: "+mark+"\n Grade: "+calculateGrade(mark));
    }

    public static void main(String[] args) {
        Student s1=new Student("Bala",112,"CSE",91);
        s1.displayDetails();
    }

}
