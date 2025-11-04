package docs;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Sample {

    public static void main(String[] args) {


       List<Integer> mylist = new ArrayList<>();

       for(int i = 1;i<=20;i++){
           mylist.add(i);
       }
       mylist.add(25);
       mylist.add(5,100);
       mylist.set(5,200);

       mylist.remove(5);

       mylist.clear();


        System.out.println(mylist);


        List<String> vec = new Vector<>();
//
//        vec.add("Apple");
//        vec.add("Banana");
//        vec.add("Mango");
//        vec.add("Banana"); // duplicate allowed
//        vec.add("Apple");
//        vec.add("Banana");
//        vec.add("Mango");
//        vec.add("Banana");
//        vec.add("Apple");
//        vec.add("Banana");
//        vec.add("Mango");
//        vec.add("Banana");
//        vec.add("Apple");
//        vec.add("Banana");
//        vec.add("Mango");
//        vec.add("Banana");
//        vec.add("Apple");
//        vec.add("Banana");
//        vec.add("Mango");
//        vec.add("Banana");
//        vec.add("Banana");
//
//
//        System.out.println( vec.capacity());
//
//        System.out.println(vec.firstElement());
//
//
//
//        List<String> stack = new Stack<>();
//        stack.push("Red");
//        stack.push("Green");
//        stack.push("Blue");
//        stack.push("black");
//
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//
//        System.out.println(stack.search("Greens"));






    }
}
