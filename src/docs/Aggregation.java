package docs;
class Address{
    String city;
    String state;


    Address(String city,String state){
        this.city = city;
        this.state = state;

    }

    void showAddress(){
        System.out.println(city+ ", "+state);
    }
}

class Students{
   int id;
   String name;
   Address address;


   Students(int id, String name, Address address){
       this.id=id;
       this.name= name;
       this.address = address;
   }


   void studentInfo(){
       System.out.println(id);
       System.out.println(name);
       System.out.println(address.city);
       System.out.println(address.state);
       address.showAddress();

   }

}
public class Aggregation {

    public static void main(String[] args) {
        Address a1 = new Address("chennai", "tamilnadu");

        Students s1 = new Students(100,"Mohamed",a1);

        s1.studentInfo();
    }


}
