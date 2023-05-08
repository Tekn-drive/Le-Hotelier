public class Guest {
    String name;
    int nights;
    private Room room;

    public Guest(String name, int nights, Room room){
        this.name=name;
        this.nights=nights;
        this.room=room;
    }

    public int room_number_guest(){
        return this.room.number;
    }

    public String room_type(){
        return this.room.type;
    }
}
