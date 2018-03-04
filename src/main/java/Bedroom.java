public class Bedroom extends Room{

    String type;


    public Bedroom(int capacity, int rate, String type){
        super(capacity, rate);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
