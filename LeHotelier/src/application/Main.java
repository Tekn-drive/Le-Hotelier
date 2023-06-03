
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.transform.Scale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			double screenWidth = screenSize.width;
			double screenHeight = screenSize.height;
			Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
			Scale scale = new Scale(screenWidth/1920,screenHeight/1080);
			root.getTransforms().add(scale);
			Scene scene = new Scene(root);
			primaryStage.setFullScreen(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}