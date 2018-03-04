import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> rooms;
    ArrayList<ConferenceRoom> eventspaces;

        public Hotel(ArrayList<Bedroom> rooms, ArrayList<ConferenceRoom> eventspaces) {
            this.rooms = rooms;
            this.eventspaces = eventspaces;
        }


        public boolean checkRoomAvailability() {
            for (Bedroom room : rooms){
                if(room.checkHeadCount() == 0) {
                    return true;
                }else {
                    return false;
                }
                }
            return false;
        }

        public boolean checkSpaceAvailability() {
            for (ConferenceRoom space : eventspaces){
                if(space.checkHeadCount() == 0) {
                    return true;
                }else {
                    return false;
                }
                }
            return false;
        }

    public int checkInGuests(Bedroom room, Guest guest) {

    }
}

//
//        public void deal(){
//            for (Player player : players){
//                for(int i = 0; i<2; i++) {
//                    player.addCardToHand(deck.getCard());
//                }
//            }
//        }
//
//        public Player checkWinner(){
//            Player player1 = players.get(0);
//            Player player2 = players.get(1);
//            if (player1.getHandValue() == player2.getHandValue()){
//                return null;
//            } else {
//                return player1.getHandValue() > player2.getHandValue() ?  player1 :  player2;
//            }
//
//        }
//    }
//
