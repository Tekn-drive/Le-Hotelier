package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Scale;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.paint.Color;

public class SceneController{
	private Scene scene;
	private Parent root;
	
	Stage stage = new Stage();
	Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	double screenWidth = screenSize.width;
	double screenHeight = screenSize.height;
	
	@FXML
	private Label wrongLogin;
	
	@FXML
	private TextField usernameTextField;
	
	@FXML
	private TextField passwordTextField;
	
	@FXML
	private Button LoginButton;
	
	@FXML
	private ImageView room_management;
	
	@FXML
	private ImageView roomBackButton;
	
	@FXML
	private ImageView hotel_management;
	
	@FXML
	private ImageView restaurant_management;
	
	@FXML
	private ImageView chefMenu;
	
	@FXML
	private Button addChef;
	
	@FXML
	private Button removeChef;
	
	@FXML
	private ImageView serverMenu;
	
	@FXML
	private ImageView orderMenu;
	
	@FXML
	private ImageView restaurantBackButton;
	
	@FXML
	private ImageView locations;
	
	@FXML
	private ImageView backButton;
	
	@FXML
	private ImageView guestMenu;
	
	@FXML
	private ImageView roomMenu;
	
	@FXML 
	private ImageView roomBack;
	
	String username,password;
	
	public void getUser(ActionEvent e) {
		username=usernameTextField.getText();
	}
	
	public void getPassword(ActionEvent e) {
		password=passwordTextField.getText();
	}
	
	public void login(ActionEvent e) throws IOException{
		  if(username.equals("admin")&& password.equals("150603")) {
		    Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		    Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		    root.getTransforms().add(scale);
		    scene = new Scene(root);
		    stage.setFullScreenExitHint("");
		    stage.setFullScreen(true);
		    stage.setScene(scene);
		    stage.show();
		  }else {
			  wrongLogin.setText("Invalid Login Credentials");
			  wrongLogin.setTextFill(Color.RED);
		  }
	}
	
	public void back(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
	    scale = new Scale(screenWidth/1920,screenHeight/1080);
	    root.getTransforms().add(scale);
	    scene = new Scene(root);
	    stage.setFullScreenExitHint("");
	    stage.setFullScreen(true);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public void manageRooms(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("RoomManagement.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
	    scale = new Scale(screenWidth/1920,screenHeight/1080);
	    root.getTransforms().add(scale);
	    scene = new Scene(root);
	    stage.setFullScreenExitHint("");
	    stage.setFullScreen(true);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public void guest(MouseEvent m) throws IOException{
	    stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Guest.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        ViewerController mvc = loader.getController();
        mvc.showGuestTable();
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	//Room Related Methods
	public void room(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("Room.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
	    scale = new Scale(screenWidth/1920,screenHeight/1080);
	    root.getTransforms().add(scale);
	    scene = new Scene(root);
	    stage.setFullScreenExitHint("");
	    stage.setFullScreen(true);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public void roomBack(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("RoomManagement.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		root.getTransforms().add(scale);
		scene = new Scene(root);
		stage.setFullScreenExitHint("");
		stage.setFullScreen(true);
		stage.setScene(scene);
		stage.show();
	}
	
	//Hotel Management Related Methods
	public void manageHotel(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelManagement.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        ViewerController mvc = loader.getController();
        mvc.showEmployeeTable();
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	//Restaurant Related Methods
	public void manageRestaurant(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("RestaurantManagement.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		root.getTransforms().add(scale);
		scene = new Scene(root);
		stage.setFullScreenExitHint("");
		stage.setFullScreen(true);
		stage.setScene(scene);
		stage.show();
	}
	
	public void manageChef(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Chef.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        ViewerController mvc = loader.getController();
        mvc.showChefTable();
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void manageServer(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Server.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        ViewerController mvc = loader.getController();
        mvc.showServerTable();
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void seeMenu(MouseEvent m) throws IOException{
		stage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
		Scale scale2 = new Scale(screenWidth/1920,screenHeight/1080);
        root = loader.load();
        root.getTransforms().add(scale2);
        ViewerController mvc = loader.getController();
        mvc.showMenu();
        Scene scene = new Scene(root);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
	}
	
	public void seeOrders(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("Order.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		root.getTransforms().add(scale);
		scene = new Scene(root);
		stage.setFullScreenExitHint("");
		stage.setFullScreen(true);
		stage.setScene(scene);
		stage.show();
	}
	
	public void restaurantBack(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("RestaurantManagement.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		root.getTransforms().add(scale);
		scene = new Scene(root);
		stage.setFullScreenExitHint("");
		stage.setFullScreen(true);
		stage.setScene(scene);
		stage.show();
	}
	
	//Location Related Methods
	public void locationsView(MouseEvent m) throws IOException{
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("Locations.fxml"));
		Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
		Stage stage = new Stage();
	    scale = new Scale(screenWidth/1920,screenHeight/1080);
	    root.getTransforms().add(scale);
	    scene = new Scene(root);
	    stage.setFullScreenExitHint("");
	    stage.setFullScreen(true);
	    stage.setScene(scene);
	    stage.show();
	}
}
