package Tasks.HotelBookingSystem;

import static Tasks.HotelBookingSystem.Customer.getContact;
import static Tasks.HotelBookingSystem.Room.*;

public class Booking {
    String customer;
    String room;
    int numberOfDays;
    long contact=getContact();
    int roomNo=getRoomNo();
    String type=getType();
    double pricePerNight=getPricePerNight();

    Booking(String customer,long contact,int roomNo,String type,double pricePerNight,int numberOfDays){
        this.customer=customer;
        this.contact=contact;
        this.roomNo=roomNo;
        this.type=type;
        this.numberOfDays=numberOfDays;
        this.pricePerNight=pricePerNight;
    }

    void displayBookingDetails(){
        System.out.println("Customer: "+customer+"| Contact :"+contact+"| Room No: "+roomNo+" | Type: "+type+"| Price per Night: Rs."+(int)(pricePerNight)+" | Days: "+numberOfDays+" | Total Bill : Rs."+(int)calculateTotalBill(pricePerNight,numberOfDays));
    }

    static double calculateTotalBill(double pricePerNight,int numberOfDays){
        return pricePerNight*numberOfDays;
    }

    public static void main(String[] args) {
        Booking b1=new Booking("Meena",9876543210l,102,"Deluxe",2500,3);
        b1.displayBookingDetails();
    }
}
