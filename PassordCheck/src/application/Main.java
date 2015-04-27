package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

		@Override
		public void start(Stage primaryStage) {
			primaryStage.setTitle("Password Check");
			
			try {
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("PasswordCheck.fxml"));
				AnchorPane page = (AnchorPane) loader.load();
				Scene scene = new Scene(page);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (IOException e) {
				System.err.println("Error loading PasswordCheck.fxml!");
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}
	
	

