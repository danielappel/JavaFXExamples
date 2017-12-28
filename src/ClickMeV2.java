//Import statements for GUI components
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class ClickMeV2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	//Declare the button
	Button btn;
	Label lbl;
	int iClickCount = 0;
	
	@Override public void start(Stage primaryStage) {
		//Create the button
		btn = new Button();
		btn.setText("Click me please");
		btn.setOnAction(e -> buttonClick());
		
		//Create border pane for components
		BorderPane pane = new BorderPane();
		
		//Create the label
		lbl = new Label("You have not clicked the button");
		
		//Add the label to the scene
		pane.setTop(lbl);
		
		//Add the button to the layout pane
		pane.setCenter(btn);
		
		//Add the layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		
		//Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click counter");
		primaryStage.show();
		
	}
	
	public void buttonClick() {
		//Update label
		iClickCount++;
		
		lbl.setText("You have clicked the button: " + iClickCount + " times");
		
		
		//Update button text
		if(btn.getText().equals("Click me please")) {
			btn.setText("You clicked me!");
		}
		else {
			btn.setText("Click me please");
		}
	}
}
