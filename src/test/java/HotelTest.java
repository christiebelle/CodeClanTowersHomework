import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    Bedroom bedroom1;
    Bedroom bedroom2;


    ConferenceRoom confroom1;
    ConferenceRoom confroom2;

    ArrayList<Bedroom> rooms;
    ArrayList<ConferenceRoom> eventspaces;

    Hotel hotel;

    @Before
    public void before() {
        guest1 = new Guest("William Marshal");
        guest2 = new Guest("Isabelle DeClare");

        bedroom1 = new Bedroom(2, 150, "King", 15);

        confroom1 = new ConferenceRoom(250, 500, "Libellule Room", "Theatre");

        rooms = new ArrayList<>();
        eventspaces = new ArrayList<>();

        rooms.add(bedroom1);

        eventspaces.add(confroom1);

        hotel = new Hotel(rooms, eventspaces);
    }


    @Test
    public void testCheckRoomAvailability() {
        assertEquals(true, hotel.checkRoomAvailability());
    }

    @Test
    public void testCheckSpaceAvailability(){
        assertEquals(true, hotel.checkSpaceAvailability());
    }

    @Test
    public void testCheckInGuest() {
        //ARRANGE
            //guest 1 and guest 2 and the room they are checking in to
        //ACT
            //add guests to the room
        bedroom1.checkIn(guest1);
        //ASSERT
            //assert that bedroom1 has 2 guests in it.
        assertEquals(1, bedroom1.checkHeadCount());
    }

    @Test
    public void testCheckOutGuest() {
        bedroom1.checkIn(guest1);
        bedroom1.checkIn(guest2);
        bedroom1.checkOut();
        assertEquals(1, bedroom1.checkHeadCount());
    }
}

