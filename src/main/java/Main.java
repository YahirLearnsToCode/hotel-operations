public class Main {

    public static void main(String[] args) {

//        Room room1 = new Room();
//
//        Reservation res1 = new Reservation("king", 4);
//
//        room1.checkIn();
//        System.out.println(room1.isAvailable());
//        room1.checkIn();
//        room1.checkOut();
//
        Hotel hotel1 = new Hotel("HotelInn", 5, 10);

        hotel1.bookRoom(3,false);
        hotel1.bookRoom(5,true);

        System.out.println(hotel1.getAvailableSuites());
    }
}
