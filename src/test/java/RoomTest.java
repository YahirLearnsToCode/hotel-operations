import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        Room room1 = new Room();
        room1.checkIn();

        assertFalse(room1.isAvailable());
        assertTrue(room1.isDirty());
        assertTrue(room1.isOccupied());
    }

    @Test
    void checkOut() {
        Room room2 = new Room();
        room2.checkOut();

        assertFalse(room2.isOccupied());
        assertFalse(room2.isDirty());
    }

    @Test
    void cleanRoom() {
        Room room3 = new Room();
        room3.checkIn();
        room3.cleanRoom();

        if (room3.isOccupied()) {
            assertTrue(room3.isDirty());
        }
    }
}