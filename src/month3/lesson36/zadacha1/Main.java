package month3.lesson36.zadacha1;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(1);
        flat.setCountFamily(5);
        flat.setId(1);
        System.out.println(flat);
        flat.utilityServices();

        Hostel hostel = new Hostel(6, 2, 2);
        System.out.println(hostel);
        hostel.paymentForAccommodation();

        Hotel hotel = new Hotel(4, 3, 3);
        System.out.println(hotel);
        hotel.paymentForAccommodationHotel();
    }
}
