import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Marc Antony");
        guest2 = new Guest("Cleopatra");
        bedroom1 = new Bedroom(2, 100, "Double", 10);
    }

    @Test
    public void testRoomCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void testRoomNumber() {
        assertEquals(10, bedroom1.getRoomNumber());
    }

    @Test
    public void testRoomPrice() {
        assertEquals(100, bedroom1.getRate());
    }

    @Test
    public void testCheckInGuests() {
        bedroom1.checkIn(guest1);
        assertEquals(1, bedroom1.checkHeadCount());
    }

    @Test
    public void testCheckOutGuests() {
        bedroom1.checkIn(guest1);
        bedroom1.checkIn(guest2);
        bedroom1.checkOut();
        assertEquals(1, bedroom1.checkHeadCount());
    }
}
