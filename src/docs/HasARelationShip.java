package docs;

class Book{
    String bookName="abc";
    int bookId= 12541;

}

class Student extends Book{
    int id;
    String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class Teacher{
    int id;
    String name;
    String dept;


    Teacher(int id, String name, String dept){
        this.id= id;
        this.name = name;
        this.dept = dept;

    }

    void teaches(Student s){
        System.out.println("Teacher Name: "+name+", Department of"+dept);
        System.out.println("Teaches : "+s.name+", id: "+s.id+", "+s.bookName);
    }

}
public class HasARelationShip {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(121,"Mohamed","Java");

        Student s1 = new Student(1,"Ismail");

        t1.teaches(s1);
    }
}
