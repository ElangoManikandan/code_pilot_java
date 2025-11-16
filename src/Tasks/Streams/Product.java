package Tasks.Streams;

import java.util.*;
import java.util.stream.Stream;

public class Product {
     String name;
     long id;
    String category;
    double price;
    int rating;
    Product(String name,long id,String category,double price,int rating){
        this.name=name;
        this.id=id;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }
    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }
    public String getCategory(){
        return category;
    }
    public double getprice(){
        return price;
    }
    public int getRating(){
        return rating;
    }

    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Smartphone",101,"Electronics",30000,7));
        products.add(new Product("Watch",111,"Electronics",3500,5));
        products.add(new Product("Travel Bag",121,"Bags",7000,6));
        products.add(new Product("Air Cooler",131,"HouseHold",30000,5));
        products.add(new Product("Washing Machine",101,"HouseHold",30000,5));
        products.add(new Product("Bed",151,"HouseHold",10000,5));
        products.add(new Product("Laptop",101,"Electronics",48000,7));
        products.add(new Product("pen drive",101,"Electronics",1000,3));
        Stream<Product> sorted_products=products.stream().filter(Product->Product.getCategory().equals("Electronics"))
                .filter(p -> p.getRating()>4)
                .sorted(Comparator.comparingDouble(p->p.price));
        Stream<Product> sorted_products2=products.stream().filter(Product->Product.getCategory().equals("Electronics"))
                .filter(p -> p.getRating()>4)
                .sorted(Comparator.comparingDouble(p->p.price));
//                .forEach(System.out::println);
//                .min(Comparator.comparingDouble(p->p.price));
//        minimum.ifPresent(System.out::println);
//        minimum.forEach((p)-> System.out.println(p.getName()+" "+p.getprice()));
        Optional<Product> min=sorted_products.min(Comparator.comparingDouble(p->p.getprice()));
        min.ifPresent(p->{
            System.out.println("The Product of Minimum Price :"+p.getName()+", Price: "+p.getprice());
        });
        Optional<Product> max=sorted_products2.max(Comparator.comparingDouble((p)->p.getprice()));
        max.ifPresent(p->{
            System.out.println("The product of Maximum Price: "+p.getName()+", Price: "+p.getprice());
        });
    }
}
