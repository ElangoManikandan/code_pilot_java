package package2;


public class parent {
   int age;
   char gender;
public void display(){
    System.out.println("displaying void function");
}
public void display(int a,int b){
    System.out.println(a);
}
void display(int age,char gender){
    this.gender=gender;
    this.age=age;
}

    public static void main(String[] args) {
        parent par=new parent();
        par.display(21,'M');
        System.out.println(par.age);
        System.out.println(par.gender);
    }
}
