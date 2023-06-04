package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Scale;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import javafx.stage.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;


public class ViewerController{
	ArrayList <Employee> employees = new ArrayList<Employee>();
	ArrayList <Server> servers = new ArrayList<Server>();
	ArrayList <Chef> chefs = new ArrayList<Chef>();
	ArrayList <Guest> guests = new ArrayList<Guest>();
	
	Stage stage = new Stage();
	private Parent root;
	Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	double screenWidth = screenSize.width;
	double screenHeight = screenSize.height;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField roomType;
	
	@FXML
	private TextField nights;
	
	@FXML
	private Label text;
	
	@FXML
	private ListView<String> menuView;
	
	@FXML 
	private TableView<Employee> employeeTable;
	
	@FXML
	private TableColumn<Employee,String>employeeID;
	
	@FXML
	private TableColumn<Employee,String>employeeName;
	
	@FXML
	private TableView<Server> serverTable;
	
	@FXML
	private TableColumn<Server,String>serverID;
	
	@FXML
	private TableColumn<Server,String>serverName;
	
	@FXML
	private TableView<Chef> chefTable;
	
	@FXML
	private TableColumn<Chef,String>chefID;
	
	@FXML
	private TableColumn<Chef,String>chefName;
	
	@FXML
	private TableView<Guest> guestTable;
	
	@FXML
	private TableColumn<Guest,String>guestName;
	
	@FXML
	private TableColumn<Guest,Integer>nightsStayed;
	
	@FXML
	private TableColumn<Guest,Integer>roomNumber;
	
	@FXML
	private ImageView menuBack;
	
	@FXML
	private ImageView chefBack;
	
	@FXML
	private ImageView serverBack;
	
	@FXML
	private ImageView hotelBack;
	
	@FXML
	private ImageView guestBack;
	
	@FXML
	private ImageView employeeBack;
	
	@FXML
	private Button addGuest;
	
	@FXML
	private Button addChef;
	
	@FXML
	private Button addC;
	
	@FXML
	private Button addG;
	
	@FXML
	private Button addEmployee;
	
	@FXML
	private Button addServer;
	
	@FXML
	private Button removeGuest;
	
	@FXML
	private Button removeChef;
	
	@FXML
	private Button removeEmployee;
	
	@FXML
	private Button removeServer;
	
	String [] menuList = {"Capaccio Scallops","Beef Stroganof","Filet Mignon","Potted Crab","Pecel Lele", "Creamy Risotto","Grand Aioli","Caviar Fried Rice","Sugar Honey Iced Tea"};
	
	String Name,room;
	Integer night_count;
	
	private ObservableList<Employee> observableEmployees = FXCollections.observableArrayList();
	private ObservableList<Chef> observableChefs = FXCollections.observableArrayList();
	private ObservableList<Server> observableServers = FXCollections.observableArrayList();
	private ObservableList<Guest> observableGuests = FXCollections.observableArrayList();
	
	public void showMenu() {
		menuView.getItems().addAll(menuList);		
	}
	
	public void removeE(ActionEvent e) {
		Employee selectedEmployee = employeeTable.getSelectionModel().getSelectedItem();
	    if (selectedEmployee != null) {
	        observableEmployees.remove(selectedEmployee);
	    }
	    
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
	        for (Employee employee : observableEmployees) {
	            writer.write(employee.getId() + "," + employee.getName());
	            writer.newLine();
	        }
	    } catch (IOException k) {
	        k.printStackTrace();
	    }
	}
	
	public void removeC(ActionEvent e) {
		Chef selectedChef = chefTable.getSelectionModel().getSelectedItem();
	    if (selectedChef != null) {
	        observableChefs.remove(selectedChef);
	    }
	    
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("chefs.txt"))) {
	        for (Chef ch : observableChefs) {
	            writer.write(ch.getId() + "," + ch.getName());
	            writer.newLine();
	        }
	    } catch (IOException k) {
	        k.printStackTrace();
	    }
	}
	
	public void removeS(ActionEvent e) {
		Employee selectedServer = serverTable.getSelectionModel().getSelectedItem();
	    if (selectedServer != null) {
	        observableServers.remove(selectedServer);
	    }
	    
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("servers.txt"))) {
	        for (Server se : observableServers) {
	            writer.write(se.getId() + "," + se.getName());
	            writer.newLine();
	        }
	    } catch (IOException k) {
	        k.printStackTrace();
	    }
	}
	
	public void removeG(ActionEvent e) {
		Guest selectedGuest = guestTable.getSelectionModel().getSelectedItem();
	    if (selectedGuest != null) {
	        observableGuests.remove(selectedGuest);
	    }
	    
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("guests.txt"))) {
	        for (Guest g : observableGuests) {
	            writer.write(g.getName() + "," + g.getNights() + "," + g.getRoomNumber());
	            writer.newLine();
	        }
	    } catch (IOException k) {
	        k.printStackTrace();
	    }
		
	}
	
	public void setEmployee(ActionEvent e) {
		String employee_id=employeeID();
		Employee emp = new Employee(employee_id,Name);
		employees.add(emp);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", StandardCharsets.UTF_8,true))) {
            for (Employee employ : employees) {
                writer.write(employ.id + "," + employ.name);
                writer.newLine();
            }
        } catch (IOException z) {
            z.printStackTrace();
        }
		text.setText("Employee Sucessfully Added");
	}
	
	public void setServer(ActionEvent e) {
		String server_id=serverID();
		Server ser = new Server(server_id,Name);
		servers.add(ser);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("servers.txt", StandardCharsets.UTF_8,true))) {
            for (Server serve : servers) {
                writer.write(serve.id + "," + serve.name);
                writer.newLine();
            }
        } catch (IOException z) {
            z.printStackTrace();
        }
		text.setText("Server Sucessfully Added");
	}
	
	public void setChef(ActionEvent e) {
		String chef_id=chefID();
		Chef che = new Chef(chef_id,Name);
		chefs.add(che);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("chefs.txt", StandardCharsets.UTF_8,true))) {
            for (Chef ch : chefs) {
                writer.write(ch.id + "," + ch.name);
                writer.newLine();
            }
        } catch (IOException z) {
            z.printStackTrace();
        }
		text.setText("Chef Sucessfully Added");
	}
	
	public void setGuest(ActionEvent e) {
		int roomN = room_number(room);
		Guest gu = new Guest(Name,night_count,roomN);
		guests.add(gu);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("guests.txt", StandardCharsets.UTF_8,true))) {
            for (Guest g : guests) {
                writer.write(g.name + "," + g.nights + "," + g.room_number);
                writer.newLine();
            }
        } catch (IOException z) {
            z.printStackTrace();
        }
		text.setText("Guest Sucessfully Added");
	}
	
	public void getRoomType(ActionEvent e){
		room = roomType.getText();
	}
	
	public void getNights(ActionEvent e){
		night_count = Integer.parseInt(nights.getText());
	}
	
	public void getName(ActionEvent e) {
		Name=name.getText();
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
	
	public static String serverID(){
        Integer random = (int)((Math.random()*(9999-1))+1);
        String id="";
        String n = random.toString();

        if(random<10){
            id="SE-000";
            id=id.concat(n);
        }else if(random<100){
            id="SE-00";
            id=id.concat(n);
        }else if(random<1000){
            id="SE-0";
            id=id.concat(n);
        }else{
            id="SE-";
            id=id.concat(n);
        }
        return id;
    }
	
	public static String chefID(){
        Integer random = (int)((Math.random()*(9999-1))+1);
        String id="";
        String n = random.toString();

        if(random<10){
            id="CH-000";
            id=id.concat(n);
        }else if(random<100){
            id="CH-00";
            id=id.concat(n);
        }else if(random<1000){
            id="CH-0";
            id=id.concat(n);
        }else{
            id="CH-";
            id=id.concat(n);
        }

        return id;
    }
	
	
	public void showEmployeeTable() {	
	    try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 2) {
	                String id = parts[0].trim();
	                String name = parts[1].trim();
	                observableEmployees.add(new Employee(id, name));
	            }
	        }
	    } catch (IOException x) {
	        x.printStackTrace();
	    }
	    
	    employeeID.setCellValueFactory(new PropertyValueFactory<>("id"));
	    employeeName.setCellValueFactory(new PropertyValueFactory<>("name"));
	    employeeTable.setItems(observableEmployees);
	    employeeID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
	    employeeName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
	}
	
	public void showChefTable() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("chefs.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 2) {
	                String id = parts[0].trim();
	                String name = parts[1].trim();
	                observableChefs.add(new Chef(id, name));
	            }
	        }
	    } catch (IOException x) {
	        x.printStackTrace();
	    }
	    
	    chefID.setCellValueFactory(new PropertyValueFactory<>("id"));
	    chefName.setCellValueFactory(new PropertyValueFactory<>("name"));
	    chefTable.setItems(observableChefs);
	    chefID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
	    chefName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
	}
	
	public void showServerTable() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("servers.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 2) {
	                String id = parts[0].trim();
	                String name = parts[1].trim();
	                observableServers.add(new Server(id, name));
	            }
	        }
	    } catch (IOException x) {
	        x.printStackTrace();
	    }
	    
	    serverID.setCellValueFactory(new PropertyValueFactory<>("id"));
	    serverName.setCellValueFactory(new PropertyValueFactory<>("name"));
	    serverTable.setItems(observableServers);
	    serverID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
	    serverName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
	}
	
	public void showGuestTable() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("guests.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 3) {
	                String name = parts[0].trim();
	                Integer number_of_nights=Integer.parseInt(parts[1].trim());
	                Integer number_of_room=Integer.parseInt(parts[2].trim());
	                observableGuests.add(new Guest(name,number_of_nights,number_of_room));
	            }
	        }
	    } catch (IOException x) {
	        x.printStackTrace();
	    }
	    
	    guestName.setCellValueFactory(new PropertyValueFactory<>("name"));
	    nightsStayed.setCellValueFactory(new PropertyValueFactory<>("nights"));
	    roomNumber.setCellValueFactory(new PropertyValueFactory<>("name"));
	    guestTable.setItems(observableGuests);
	    guestName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
	    nightsStayed.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getNights()));
	    roomNumber.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getRoomNumber()));
	}
	
	public void home(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void restaurant(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RestaurantManagement.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void roomManagement(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RoomManagement.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void guestList(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Guest.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void AddEmployee(ActionEvent e) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddEmployee.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void AddGuest(ActionEvent e) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddGuest.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void AddChef(ActionEvent e) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddChef.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void AddServer(ActionEvent e) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddServer.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
}
