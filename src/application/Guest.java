package application;

public class Guest {
	String name;
    Integer nights, room_number;

    public Guest(String name, Integer nights, Integer room_number){
        this.name=name;
        this.nights=nights;
        this.room_number=room_number;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getNights() {
        return nights;
    }
    
    public Integer getRoomNumber() {
    	return room_number;
    }
}
