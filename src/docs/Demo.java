package docs;


class Parent{
    int amount;
    String name;

    Parent(){
        System.out.println("parent constructor called");
    }

    Parent(int amount,String name){
        this.name = name;
        this.amount = amount;
    }
    void show(){
        System.out.println(amount+", "+name);
    }
}

class Child extends Parent{
    String bike;

    String name = super.name;

    Child(String bike){
        super();
        this.bike = bike;
    }

    void car(){
        System.out.println("car method");
    }
}

public class Demo {
}
