package application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class PasswordController {
	
	@FXML
	PasswordField password;
	@FXML
	Button help;
	@FXML
	Button OK;
	Alert message = new Alert(AlertType.INFORMATION);
	
	
	@FXML
	private void handleOK() {
		if (password.getText().equals("bugaboo")) {
			message.setTitle("Information");
			message.setHeaderText(null);
			message.setContentText("Password is Correct");
			message.showAndWait();
		}
		else {
			message.setTitle("Information");
			message.setHeaderText(null);
			message.setContentText("Password is Incorrect");
			message.showAndWait();
		}
	}
	
	@FXML
	private void handleHelp() {
		message.setTitle("Information");
		message.setHeaderText(null);
		message.setContentText("Help was clicked.");
		message.showAndWait();
	}
	
	@FXML
	public void handleEnterKey(KeyEvent event) {
	    if (event.getCode() == KeyCode.ENTER) {
	    	if (password.getText().equals("bugaboo")) {
				message.setTitle("Information");
				message.setHeaderText(null);
				message.setContentText("Password is Correct");
				message.showAndWait();
			}
			else {
				message.setTitle("Information");
				message.setHeaderText(null);
				message.setContentText("Password is Incorrect");
				message.showAndWait();
			}
	    }
	}
	
	
	

}
