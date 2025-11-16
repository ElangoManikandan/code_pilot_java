package Tasks.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        //Task 1
        List<String> cities=new ArrayList<>();
        cities.add("Karur");
        cities.add("Chennai");
        cities.add("Coimbatore");
        cities.add("Madurai");
        cities.add("Kanyakumari");
        cities.add("Salem");
        cities.add("Coimbatore");
        List<String> cities_cleaned=cities
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
//        .forEach(System.out::println);
//        cities_cleaned
        for(String i:cities_cleaned){
            System.out.println(i);
        }
    }
}