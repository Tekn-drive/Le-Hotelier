package application;

public class Chef extends Employee{

    public Chef(String id, String name){
        super(id,name);
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

}
