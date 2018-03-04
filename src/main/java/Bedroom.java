public class Bedroom extends Room{

    String type;
    int roomnumber;


    public Bedroom(int capacity, int rate, String type, int roomnumber){
        super(capacity, rate);
        this.type = type;
        this.roomnumber = roomnumber;
    }

    public String getType(){
        return this.type;
    }

    public int getRoomNumber() {
        return this.roomnumber;
    }
}
