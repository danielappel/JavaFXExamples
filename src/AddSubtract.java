import javafx.application.*;
import  javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract extends Application implements EventHandler<ActionEvent> {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;
	
	@Override public void start(Stage primaryStage) {
		//Create the Add button
		btnAdd = new Button("Add");
		btnAdd.setOnAction(this); //This class will handle all events created here
		
		//Create the subtract button
		btnSubtract = new Button("Subtract");
		btnSubtract.setOnAction(this);
		
		//Create the label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
		
		//Add the buttons and the labe to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
		
		//Add the pane to the scene
		Scene scene = new Scene(pane, 200, 75);
		
		//Add the scene to the stage, set title and show stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}
	
	@Override public void handle(ActionEvent e) {
		if(e.getSource() == btnAdd) {
			iCounter++;
		}
		else {
			
			if(e.getSource() == btnSubtract) {
				iCounter--;
			}
		}
		lbl.setText(Integer.toString(iCounter));
		
	}
}
