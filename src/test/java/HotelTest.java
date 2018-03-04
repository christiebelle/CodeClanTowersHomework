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

        Hotel = new Hotel(rooms, eventspaces);
    }


    @Test
    public void testCheckRoomAvailability() {
        assertEquals(true, bedroom1.checkAvailability());
        assertEquals(true, bedroom2.checkAvailability());
    }
}
//    @Test
//    public void player1Wins(){
//        player1.addCardToHand(new Card(Suit.CLUBS, Rank.ACE));
//        player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.EIGHT));
//        Player winner = game.checkWinner();
//        assertEquals("Player 1", winner.getName());
//    }
//
//    @Test
//    public void player2Wins(){
//        player1.addCardToHand(new Card(Suit.CLUBS, Rank.THREE));
//        player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.EIGHT));
//        Player winner = game.checkWinner();
//        assertEquals("Player 2", winner.getName());
//    }
//
//    @Test
//    public void checkDraw(){
//        player1.addCardToHand(new Card(Suit.CLUBS, Rank.ACE));
//        player2.addCardToHand(new Card(Suit.DIAMONDS, Rank.ACE));
//        Player winner = game.checkWinner();
//        assertEquals(null, winner);
//    }
