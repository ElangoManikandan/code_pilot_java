package Arrays;

import java.util.*;

public class ObjectArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total Number of Students");
        int count=sc.nextInt();
        Student[] students=new Student[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter Id of Student "+(i+1));
            int id=sc.nextInt();
            System.out.println("Enter Name of Student "+(i+1));
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter The Email of Student "+(i+1));
            String email=sc.nextLine();
            System.out.println("Enter the phone number of Student "+(i+1));
            long phone=sc.nextLong();
            students[i]=new Student(id,name,email,phone);
        }
        System.out.println("Students List:");
        for(Student s:students){
            s.display();
        }
    }
}
