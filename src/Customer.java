public class Customer {
    String name,order_id;

    public Customer(String name, String order_id){
        this.name=name;
        this.order_id=order_id;
    }

    public void customer_details(){
        System.out.println("Name: " + name);
        System.out.println("Order ID: " + order_id);
    }
    
}
