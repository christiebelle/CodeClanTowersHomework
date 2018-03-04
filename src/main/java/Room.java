import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private int rate;
    private ArrayList guests;

    public Room(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }

    public ArrayList getGuests() {
        return guests;
    }

    public void checkIn(Guest newGuest) {
        this.guests.add(newGuest);
    }

    public void checkOut() {
        this.guests.remove(0);
    }

    public int checkHeadCount() {
        return this.guests.size();
    }
}