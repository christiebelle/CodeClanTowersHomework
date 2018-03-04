public class ConferenceRoom extends Room {

    String name;
    String layout;

    public ConferenceRoom(int capacity, int rate, String name, String layout) {
        super(capacity, rate);
        this.name = name;
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public String getLayout() {
        return layout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}
