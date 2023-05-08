public class Employee {
    String id, name;
    double salary;
    private Customer c;

    public Employee(String id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setCustomer(Customer c){
        this.c=c;
    }

    public String customer(){
        return this.c.name;
    }
}

