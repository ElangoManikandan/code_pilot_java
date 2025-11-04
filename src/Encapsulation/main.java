package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// normal interface
interface  Aa{
    void show();
    void display();
}


//fun interface

@FunctionalInterface
interface FunInterface{
    void add();

}

class Normal implements  Aa{

    @Override
    public void show() {
        System.out.println("this is show method");
    }

    @Override
    public void display() {
        System.out.println("this is display");
    }
}

public class main {
    public static void main(String[] args) {
//        Normal ob = new Normal();
//        ob.show();
//        ob.display();


//        FunInterface fun = new FunInterface(){
//
//            @Override
//            public void add() {
//                System.out.println("this is add");
//            }
//        };

        FunInterface fun = () -> {
            System.out.println("this is add");
        };

        fun.add();

        double a= 2.5;

        Function<Integer,Integer> add = n -> n+100;

        Function<Integer, Integer> square = n -> n*n;

        Function<Integer,Double> mul = n -> n*a;



        System.out.println(add.apply(50));
        System.out.println(square.apply(88));

        System.out.println(mul.apply(45));




        //Predicate
        Predicate<Integer> isEven = n->n%2==0;

        System.out.println(isEven.test(78));


        //consumer
        Consumer<String> printUpper = s-> System.out.println(s.toUpperCase());


        //
        Supplier<Integer> random = ()-> new Random().nextInt(1000);

        System.out.println(random.get());

        int data =10;

        Integer b = Integer.valueOf(data);
        Integer d = data;
        int c = d;

        int f = d.intValue();
        System.out.println(f);

    }
}
