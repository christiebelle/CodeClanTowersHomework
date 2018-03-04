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
        guest3 = new Guest("Mickey Mouse");
        guest4 = new Guest("Minnie Mouse");

        bedroom1 = new Bedroom(2, 150, "King");
        bedroom2 = new Bedroom(1, 75, "Single");

        confroom1 = new ConferenceRoom(250, 500, "Libellule Room", "Theatre");
        confroom2 = new ConferenceRoom(25, 500, "Brindille Room", "Boardroom");

        rooms = new ArrayList<>();
        eventspaces = new ArrayList<>();

        rooms.add(bedroom1);
        rooms.add(bedroom2);

        eventspaces.add(confroom1);
        eventspaces.add(confroom2);

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
        bedroom1.checkIn(guest1);
        //ASSERT
            //assert that bedroom1 has 2 guests in it.
        assertEquals(2, hotel.checkInGuests());
    }
}

