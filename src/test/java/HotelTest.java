import org.junit.Before;

public class HotelTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    Bedroom bedroom1;

    ConferenceRoom confroom1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("William Marshal");
        guest2 = new Guest("Isabelle deClare");
        guest3 = new Guest("Mickey Mouse");
        guest4 = new Guest("Minnie Mouse");

        bedroom1 = new Bedroom(2, 150, "King");

        confroom1 = new ConferenceRoom(50, 300, "The Walt Suite", "Theatre");
    }


}
