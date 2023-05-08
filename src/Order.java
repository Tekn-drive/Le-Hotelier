import java.util.*;
import java.lang.Math;
public class Order {
    String order_id,customer_name,server_name;
    int table_number;
    private ArrayList<Menu> menus;

    public Order(String order_id, ArrayList<Menu> menus, String customer_name, String server_name, int table_number){
        this.order_id=order_id;
        this.menus=menus;
        this.customer_name=customer_name;
        this.server_name=server_name;
        this.table_number=table_number;
    }

    public void printOrderedItems(){
        double total=0;
        System.out.println("==============================");
        System.out.printf("Order ID:%21s\n",order_id);
        System.out.printf("Customer Name:%16s\n",customer_name);
        System.out.printf("Server Name:%18s\n",server_name);
        System.out.printf("Table:%24d\n",table_number);
        System.out.println("");
        for(int i=0;i<menus.size();i++){
            System.out.printf("%s x%.0f\n",menus.get(i).name,menus.get(i).quantity);
            System.out.printf("%30.2f\n",menus.get(i).price);
            total+=menus.get(i).price;
        }
        System.out.println("");
        System.out.printf(" Total: %22.2f\n",total);
        System.out.println("==============================");
    }
}
