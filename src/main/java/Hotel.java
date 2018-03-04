import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> rooms;
    ArrayList<ConferenceRoom> eventspaces;
    Guest guest;

    public Hotel(ArrayList<Bedroom> rooms, ArrayList<ConferenceRoom> eventspaces) {
        this.rooms = rooms;
        this.eventspaces = eventspaces;
    }


    public boolean checkRoomAvailability() {
        for (Bedroom room : rooms) {
            if (room.checkHeadCount() == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean checkSpaceAvailability() {
        for (ConferenceRoom space : eventspaces) {
            if (space.checkHeadCount() == 0)
                return true;
            else
                return false;
        }
        return false;
    }

    public void checkInGuests(int number) {
        for (Bedroom room : rooms) {
            if (room.getRoomNumber() == number){
                room.checkIn(guest);
            }
        }
    }

    public void checkOutGuests(int number){
        for(Bedroom room : rooms){
            if(room.getRoomNumber() == number){
                room.checkOut();
            }
        }
    }
}


