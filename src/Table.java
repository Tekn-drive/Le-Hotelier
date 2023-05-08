public class Table {
    int TableNumber;
    String status;
    String server_id,customer_id;

    public Table(int TableNumber, String status){
        this.TableNumber=TableNumber;
        this.status=status;
    }

    public void table_details(){
        System.out.println("Table Number: " + TableNumber);
        System.out.println("Availability status:  " + status);
        System.out.println("Server ID: " + server_id);
        System.out.println("Customer ID: " + customer_id);
    }
}
