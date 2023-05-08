public class Server extends Employee{
    String server_id;
    private Table t;

    public Server(String id, String name, double salary, String server_id){
        super(id,name,salary);
        this.server_id=server_id;
    }

    public void setTable(Table t){
        this.t=t;
    }

}
