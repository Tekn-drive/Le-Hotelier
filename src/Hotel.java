public class Hotel {
    String name;
    int employees;
    boolean open;

    public Hotel(String name, int employees){
        this.name=name;
        this.employees=employees;
    }

    public void openHotel(){
        open = true;
        System.out.println(name + " is opened");
    }

    public void closeHotel(){
        open = false;
        System.out.println(name + " is closed");
    }

    public int numberofEmployees(){
        return employees;
    }

    public void addEmployee(){
        this.employees++;
    }
}
