package Tasks.Association;

class Teacher {
    String name;
    String subject;
    Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
    void teaches(Department d){
        System.out.println(name+" sir ,\n" + "Teaches "+subject+" from "+d.deptName);
    }
}

class Department{
    String deptName;
    Teacher teacher;
    Department(String deptName){
        this.deptName=deptName;
    }

}


class Main{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Mohamed","Java");
        Department dept=new Department("Full Stack Department");
        teacher.teaches(dept);
    }
}
