public class Bill {
    String bill_id,order_id;
    int totalBill;

    public Bill(String bill_id, String order_id, int totalBill){
        this.bill_id=bill_id;
        this.order_id=order_id;
        this.totalBill=totalBill;
    }

    public void calculate_bill(){
        //Calculates the bill for a partiicular table
    }
}
