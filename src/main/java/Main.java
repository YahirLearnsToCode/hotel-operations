public class Main {
    public static void main(String[] args) {

        Room room1 = new Room();

        Reservation res1 = new Reservation("king", 4);

        room1.checkIn();
        System.out.println(room1.isAvailable());
        room1.checkIn();
        room1.checkOut();
    }
}
