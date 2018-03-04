import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest1;
    Guest guest2;
    ConferenceRoom confroom1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Napoleon");
        guest2 = new Guest("Josephine");
        confroom1 = new ConferenceRoom(50, 500, "The Elba Room", "Banquet");
    }

    @Test
    public void testRoomName() {
        assertEquals("The Elba Room", confroom1.getName());
    }

    @Test
    public void testRoomLayout() {
        assertEquals("Banquet", confroom1.getLayout());
    }

    @Test
    public void testRoomCapacity() {
        assertEquals(50, confroom1.getCapacity());
    }

    @Test
    public void testRoomPrice() {
        assertEquals(500, confroom1.getRate());
    }

    @Test
    public void testCheckInGuests() {
        confroom1.checkIn(guest1);
        assertEquals(1, confroom1.checkHeadCount());
    }

    @Test
    public void testCheckOutGuests() {
        confroom1.checkIn(guest1);
        confroom1.checkIn(guest2);
        confroom1.checkOut();
        assertEquals(1, confroom1.checkHeadCount());
    }
}
