class Form {
    String name;
    int rollno;
    private long phone;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str,int num){
        name=str;
        rollno=num;
    }
    public String getname(){
        return name;
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Form user1=new Form();
//        user1.name="elango";
//        user1.rollno=123;
        user1.setValues("elango",123);
        String user1name=user1.getname();
        System.out.println(user1name);
        user1.display();

        Form user2=new Form();
//        user2.name="Gowtham";
//        user2.rollno=120;
        user2.setValues("Gowtham",122);
        user2.display();
//        user2.display();
        Form user3=new Form();
        user3.setValues("Abdullah",121);
//        user3.name="Abdullah";
//        user3.rollno=111;
        user3.display();
    }
}