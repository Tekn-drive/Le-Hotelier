package application;

public class Server extends Employee{

    public Server(String id, String name){
        super(id,name);
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
