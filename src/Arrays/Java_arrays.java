package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Student{
    int id;
    String student_name;
    String email;
    long phone;
    Student(int id,String student_name,String email,long phone){
        this.id=id;
        this.student_name=student_name;
        this.email=email;
        this.phone=phone;
    }
    void display(){
        System.out.println("The Student ID :"+id+" | Name : "+student_name+" | Email : "+email+" | Phone Number : "+phone);
    }
}

public class Java_arrays {
    public static void main(String[] args) {
//        int arr[]=new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        int[] array1={1,2,3,4,5};
//        System.out.println(Arrays.toString(array1));
//        boolean flag=sc.nextBoolean();
//        sc.nextLine();
//        String name=sc.nextLine();
//        System.out.println(name);
//        Scanner sc=new Scanner(System.in);
//        int input=sc.nextInt();
//        int[] arr=new int[input];
//        for(int i=0;i<input;i++){
//            int element=sc.nextInt();
//            arr[i]=element;
//        }
//        System.out.println(Arrays.toString(arr));
//        Student[] students=new Student[3];
//        students[0]=new Student(1,"Abdullah");
//        students[1]=new Student(2,"Elango");
//        students[2]=new Student(3,"Gowtham");
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
