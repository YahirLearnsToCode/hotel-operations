import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.zip.CheckedInputStream;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;

        if (roomType.equalsIgnoreCase("king")) this.price = 139.00;
        if (roomType.equalsIgnoreCase("double")) this.price = 124.00;

        int checkDayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        if (checkDayOfWeek > 5) weekend = true;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        return price;
    }

    public void getReservationTotal() {
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Number Of Nights: " + this.numberOfNights);
        if (weekend) System.out.println("Weekend Fee: +$" + this.price * .10);
        System.out.println("Total Reservation Price: $" + this.price + (this.price *.10));
    }
}
