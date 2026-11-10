public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public boolean isOccupied() {
        return occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public void checkIn() {
        if (isOccupied() || isDirty()) {
            System.out.println("Room is not ready just yet");
        } else {
            this.occupied = true;
            this.dirty = true;
        }
    }

    public void checkOut() {
        this.occupied = false;
        this.dirty = false;

    }

    public void cleanRoom() {
        this.dirty = false;
    }
}
