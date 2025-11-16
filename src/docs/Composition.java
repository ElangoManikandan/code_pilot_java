package docs;


class Room{
    int roomNo;
    Room(int roomNo){
        this.roomNo = roomNo;
    }


}

class House{
    String name;
    int houseNo;
    Room room;


    House(String name,int houseNo,int roomNo){
        this.name = name;
        this.houseNo= houseNo;
        this.room = new Room(roomNo);
    }

    void houseInfo(){
        System.out.println(name);
        System.out.println(houseNo);
        System.out.println(room.roomNo);
    }

}



public class Composition {

    public static void main(String[] args) {
        House h1= new House("Mohamed Illam",666,2);
        h1.houseInfo();


        h1 = null;
        h1.houseInfo();
    }
}
