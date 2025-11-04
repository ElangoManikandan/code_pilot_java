package Tasks.HotelBookingSystem;

public class Room {
    static int roomNo;
    static String type;
    static double pricePerNight;

    static int getRoomNo(){
        return Room.roomNo;
    }
    static String getType(){
        return Room.type;
    }
    static double getPricePerNight(){
        return Room.pricePerNight;
    }
}
