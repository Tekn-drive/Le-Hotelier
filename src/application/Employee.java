package application;

public class Employee {
	String id, name;

    public Employee(String id, String name){
        this.id=id;
        this.name=name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
