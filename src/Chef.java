public class Chef extends Employee{
    String chef_id,order_id;
    private Order o;

    public Chef(String id, String name, double salary, String chef_id){
        super(id,name,salary);
        this.chef_id=chef_id;
    }

    public void setOrder(String order_id){
        this.order_id=order_id;
    }
}
