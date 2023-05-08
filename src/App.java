import java.util.*;

public class App {

    public static String employeeID(){
        Integer random = (int)((Math.random()*(9999-1))+1);
        String id="";
        String n = random.toString();

        if(random<10){
            id="EM-000";
            id=id.concat(n);
        }else if(random<100){
            id="EM-00";
            id=id.concat(n);
        }else if(random<1000){
            id="EM-0";
            id=id.concat(n);
        }else{
            id="EM-";
            id=id.concat(n);
        }

        return id;
    }

    public static String orderID(){
        Integer random = (int)((Math.random()*(9999-1))+1);
        String id="";
        String n = random.toString();

        if(random<10){
            id="OR-000";
            id=id.concat(n);
        }else if(random<100){
            id="OR-00";
            id=id.concat(n);
        }else if(random<1000){
            id="OR-0";
            id=id.concat(n);
        }else{
            id="OR-";
            id=id.concat(n);
        }

        return id;
    }

    public static void displayEmployees(ArrayList<Employee> employees){
        System.out.println("===========================================");
        System.out.println("|     ID|             Name|         Salary|");
        System.out.println("===========================================");

        if(employees.isEmpty()){
            System.out.println("|              No Employees Yet           |");
        }
        for(int i=0;i<employees.size();i++){
            System.out.printf("|%7s|%17s|%15.2f|\n",employees.get(i).id,employees.get(i).name,employees.get(i).salary);
        }
        System.out.println("===========================================");
    }

    public static void displayServers(ArrayList<Server> servers){
        System.out.println("===========================================");
        System.out.println("|     ID|             Name|         Salary|");
        System.out.println("===========================================");

        if(servers.isEmpty()){
            System.out.println("|              No Servers Yet           |");
        }
        for(int i=0;i<servers.size();i++){
            System.out.printf("|%7s|%17s|%15.2f|\n",servers.get(i).server_id,servers.get(i).name,servers.get(i).salary);
        }
        System.out.println("===========================================");
    }

    public static void displayChefs(ArrayList<Chef> chefs){
        System.out.println("===========================================");
        System.out.println("|     ID|             Name|         Salary|");
        System.out.println("===========================================");

        if(chefs.isEmpty()){
            System.out.println("|              No Chefs Yet           |");
        }
        for(int i=0;i<chefs.size();i++){
            System.out.printf("|%7s|%17s|%15.2f|\n",chefs.get(i).chef_id,chefs.get(i).name,chefs.get(i).salary);
        }
        System.out.println("===========================================");
    }

    public static int room_number(String room_type){
        int number=0;
        if(room_type.equals("Economy")){
            number=(int)((Math.random()*(1000-1))+1);
        }else if(room_type.equals("Deluxe")){
            number=(int)((Math.random()*(1500-1001))+1001);
        }else if(room_type.equals("Business")){
            number=(int)((Math.random()*(1750-1501))+1501);
        }        
        return number;
    }
    
    
    public static void main(String[] args) throws Exception {
        Hotel h = new Hotel("Arc de Triomphe Hotel",0);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Server> servers = new ArrayList<Server>();
        ArrayList<Chef> chefs = new ArrayList<Chef>();
        ArrayList<Order> orders= new ArrayList<Order>();
        ArrayList<Guest> guests = new ArrayList<Guest>();

        Table[] tables = new Table[20];

        for(int i=0;i<20;i++){
            Table t = new Table(i+1,"Available");
            tables[i]=t;
        }

        Scanner input = new Scanner(System.in);
        int choice=0;

        while(choice!=5){
            System.out.println("Le Hotelier");
            System.out.println("===========");
            System.out.println("1. Hotel Management");
            System.out.println("2. Restaurant Management");
            System.out.println("3. Room Management");
            System.out.println("4. Location Finder");
            System.out.println("5. Exit");
            System.out.println("===========");
            System.out.print(">> ");
            choice=input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    int hotel_choice=0;

                    while(hotel_choice!=4){
                        System.out.println("Hotel Management");
                        System.out.println("================");
                        System.out.println("1. Add Employee");
                        System.out.println("2. Remove Employee");
                        System.out.println("3. Open/Close Hotel");
                        System.out.println("4. Exit");
                        System.out.println("================");
                        System.out.print(">> ");
                        hotel_choice = input.nextInt();
                        input.nextLine();

                        if(hotel_choice==1){
                            displayEmployees(employees);
                            System.out.print("Name: ");
                            String name=input.nextLine();
                            double salary = 1466.62;
                            String employee_id=employeeID();
                            Employee e = new Employee(employee_id, name, salary);
                            employees.add(e);
                            h.employees++;
                            System.out.println("Successfully created a new employee with ID: " + e.id);
                        }else if(hotel_choice==2){
                            if(h.employees==0){
                                displayEmployees(employees);
                            }else{
                                displayEmployees(employees);
                                System.out.print("Please select the number: ");
                                int number=input.nextInt();
                                input.nextLine();
                                System.out.println("Employee with ID: " + employees.get(number-1).id + " is successfully removed");
                                employees.remove(employees.get(number-1));
                                h.employees--;
                            }
                        }else if(hotel_choice==3){
                            System.out.println("Open/Close Hotel");
                            System.out.println("================");
                            System.out.println("1. Open Hotel");
                            System.out.println("2. Close Hotel");
                            System.out.println("================");
                            int hotel_choice2=input.nextInt();

                            if(hotel_choice2==1){
                                h.openHotel();
                            }else if(hotel_choice2==2){
                                h.closeHotel();
                            }

                        }
                    }
                break;

                case 2:
                    int restaurant_choice=0;
                    while(restaurant_choice!=5){
                        System.out.println("Restaurant Management");
                        System.out.println("=====================");
                        System.out.println("1. Add Server/Chef");
                        System.out.println("2. View Servers/Chefs");
                        System.out.println("3. Make Order");
                        System.out.println("4. View Order List");
                        System.out.println("5. Exit");
                        System.out.println("=====================");
                        System.out.print(">> ");
                        restaurant_choice=input.nextInt();
                        input.nextLine();

                        if(restaurant_choice==1){
                            System.out.println("Add Server/Chef");
                            System.out.println("Choose 1 of the following: ");
                            System.out.println("1. Server");
                            System.out.println("2. Chef");
                            System.out.println("===========================");
                            System.out.print(">> ");
                            int restaurant_choice2=input.nextInt();
                            input.nextLine();
                            displayEmployees(employees);
                            if(restaurant_choice2==1){
                                System.out.print("Choose the number of employee to be server: ");
                                int number = input.nextInt();
                                input.nextLine();

                                //If an employee is to be a server, increase his/her salary by 20%
                                employees.get(number-1).salary=employees.get(number-1).salary*120/100;
                                Employee e = employees.get(number-1);
                                String employee_digit = e.id.substring(3, 7);
                                String server_id="SE-".concat(employee_digit); 
                                Server s = new Server(e.id,e.name,e.salary,server_id);
                                servers.add(s);
                                System.out.println(e.name + " is promoted to " + "server position with the ID: " + server_id);
                            }else if(restaurant_choice2==2){    
                                System.out.print("Choose the number of employee to be chef: ");
                                int number = input.nextInt();
                                input.nextLine();

                                //If an employee is to be a chef, increase his/her salary by 35%
                                employees.get(number-1).salary=employees.get(number-1).salary*135/100;
                                Employee e = employees.get(number-1);
                                String employee_digit = e.id.substring(3, 7);
                                String chef_id="CH-".concat(employee_digit); 
                                Chef c = new Chef(e.id,e.name,e.salary,chef_id);
                                chefs.add(c);
                                System.out.println(e.name + " is promoted to " + "chef position with the ID: " + chef_id);
                            }
                        }else if(restaurant_choice==2){
                            System.out.println("View Servers/Chefs");
                            System.out.println("Choose 1 of the following: ");
                            System.out.println("1. Server");
                            System.out.println("2. Chef");
                            System.out.println("===========================");
                            System.out.print(">> ");
                            int restaurant_choice2=input.nextInt();

                            if(restaurant_choice2==1){
                                displayServers(servers);
                            }else if(restaurant_choice2==2){
                                displayChefs(chefs);
                            }
                        }else if(restaurant_choice==3){
                            //1. Pick the server's name and register the customer's name (using association relationship)
                            System.out.println("Pick your name: ");
                            displayServers(servers);
                            System.out.print(">> ");
                            int name_number=input.nextInt();
                            input.nextLine();
                            Server s = servers.get(name_number-1);
                            String order_id=orderID();
                            System.out.print("Please input customer name: ");
                            String name = input.nextLine();
                            Customer c = new Customer(name,order_id);
                            s.setCustomer(c);

                            //2. Pick a random table number as long as it is not occupied
                            boolean found_empty_table=false;
                            int index=0;
                            while(found_empty_table==false){
                                index = (int)((Math.random()*20-1)-1);
                                if(tables[index-1].status=="Available"){
                                    tables[index-1].status="Occupied";
                                    System.out.println("Found empty table with the number: " + tables[index-1].TableNumber);
                                    found_empty_table=true;
                                }
                            }

                            Table t = tables[index-1];
                            s.setTable(t);

                            //3. Ask the customer to order some items
                            ArrayList<Menu> menus = new ArrayList<Menu>();
                            char option='Y';

                            while(option=='Y'){
                                System.out.print("Please input the menu name: ");
                                String menu_name=input.nextLine();
                                System.out.print("Please input the quantity of the menu: ");
                                double menu_quantity=input.nextDouble();
                                input.nextLine();
                                System.out.print("Please input the price for each: ");
                                double menu_price=input.nextDouble();
                                input.nextLine();
                                Menu m = new Menu(menu_name,menu_quantity*menu_price,menu_quantity);
                                menus.add(m);
                                System.out.print("Do you want to add more (Y/N)? ");
                                System.out.print(">> ");
                                option=input.nextLine().charAt(0);
                                
                                if(option=='N'){
                                    break;
                                }
                            }

                            Order o = new Order(order_id,menus,s.customer(),s.name,t.TableNumber);

                            //4. Add the order listing to the queue
                            orders.add(o);

                        }else if(restaurant_choice==4){
                            System.out.println("====================================================");
                            System.out.println("|Order ID|    Customer Name|      Server Name|Table|");
                            System.out.println("====================================================");
                            for(int i=0;i<orders.size();i++){
                                System.out.printf("|%8s|%17s|%17s|%5d|\n",orders.get(i).order_id,orders.get(i).customer_name,orders.get(i).server_name,orders.get(i).table_number);
                            }
                            System.out.println("====================================================");
                            System.out.print("Please select the order index: ");
                            int order_index=input.nextInt();
                            input.nextLine();

                            System.out.println("Please select the option to be done with it: ");
                            System.out.println("1. View Order Details");
                            System.out.println("2. Remove Order");
                            System.out.print(">> ");
                            int restaurant_choice2=input.nextInt();
                            input.nextLine();
                            if(restaurant_choice2==1){
                                orders.get(order_index-1).printOrderedItems();
                            }else if(restaurant_choice2==2){
                                String temp_ID=orders.get(order_index-1).order_id;
                                int table_number=orders.get(order_index-1).table_number;

                                for(int i=0;i<20;i++){
                                    if(tables[i].TableNumber==table_number){
                                        tables[i].status="Available";
                                    }
                                }
                                orders.remove(order_index-1);
                                System.out.printf("Order %s successfully removed\n",temp_ID);
                            }                            
                        }
                    }
                break;

                case 3:
                    System.out.println("Room Management");
                    System.out.println("===============");
                    System.out.println("1. Register Guest");
                    System.out.println("2. View Guest List");
                    System.out.println("3. Checkout Guest");
                    System.out.println("===============");
                    System.out.print(">> ");
                    int room_choice=input.nextInt();
                    input.nextLine();
                    if(room_choice==1){
                        System.out.print("Please input the guests name: ");
                        String name = input.nextLine();
                        System.out.print("Please input the nights to be stayed: ");
                        int nights=input.nextInt();
                        input.nextLine();
                        System.out.print("Please input the room type boooked: ");
                        String room_type=input.nextLine();
                        Room r = new Room(room_type,room_number(room_type));
                        Guest g = new Guest(name,nights,r);
                        guests.add(g);
                        System.out.printf("%s is successfully registered as a guest with the room number of %s.\n",name,r.number);
                    }else if(room_choice==2){
                        System.out.println("========================================================");
                        System.out.println("|   Guest Name| Room Type|  Nights Stayed|  Room Number|");
                        System.out.println("========================================================");
                        for(int i=0;i<guests.size();i++){
                            System.out.printf("|%13s|%10s|%15d|%13d|\n",guests.get(i).name,guests.get(i).room_type(),guests.get(i).nights,guests.get(i).room_number_guest());
                        }
                        System.out.println("========================================================");
                    }else if(room_choice==3){
                        System.out.println("========================================================");
                        System.out.println("|   Guest Name| Room Type|  Nights Stayed|  Room Number|");
                        System.out.println("========================================================");
                        for(int i=0;i<guests.size();i++){
                            System.out.printf("|%13s|%10s|%15d|%13d|\n",guests.get(i).name,guests.get(i).room_type(),guests.get(i).nights,guests.get(i).room_number_guest());
                        }
                        System.out.println("========================================================");
                        System.out.print("Please input the index of the guest who is checking out: ");
                        int guest_index=input.nextInt();
                        input.nextLine();
                        String temp=guests.get(guest_index-1).name;
                        guests.remove(guest_index-1);
                        System.out.printf("Successfully checked out %s\n",temp);
                    }
                break;

                case 4:
                    System.out.println("Location of " + h.name);
                    System.out.println("Address: 1 Place Charles de Gaulle, 75017 Paris");
                    System.out.println("Phone number: +33 155377377");
                break;
            }
        }
        input.close();
    }
}
