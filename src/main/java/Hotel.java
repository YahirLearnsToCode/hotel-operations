public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedbasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedbasicRooms = 0;
        this.bookedSuites = 0;

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedbasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (roomCount <= this.numberOfSuites && suite) {
            bookedSuites += roomCount;
            System.out.println("Suites Booked");
            return true;

        } else if (roomCount <= this.numberOfRooms && !suite){
            bookedbasicRooms += roomCount;
            System.out.println("Basic Rooms Booked");
            return true;
        }

        System.out.println("Could not book rooms");
        return false;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int availableRooms() {
        return numberOfRooms - bookedbasicRooms;
    }
}
