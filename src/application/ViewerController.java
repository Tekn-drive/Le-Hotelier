package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Scale;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


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
	private ListView<String> menuView;
	
	@FXML 
	private TableView<Employee> employeeView;
	
	@FXML
	private TableView<Server> serverView;
	
	@FXML
	private TableView<Chef> chefView;
	
	@FXML
	private TableView<Guest> guestView;
	
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

	public void showMenu() {
		menuView.getItems().addAll(menuList);		
	}
	
	public void home(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void hotel(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelManagement.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        Scene scene = new Scene(root);
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
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	
	public void test() {
		System.out.println("Hello");
	}
	
	

}
