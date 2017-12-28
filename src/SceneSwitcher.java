import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;


public class SceneSwitcher extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	//Class fields for click counter scene
	int iClickCount = 0;
	Label lblClicks;
	Button btnClickMe;
	Button btnSwitchToScene2;
	Scene scene1;
	
	//Class fields for add/subtract scene
	int iCounter = 0;
	Label lblCounter;
	Button btnAdd;
	Button btnSubtract;
	Button btnSwitchToScene1;
	Scene scene2;
	
	//Class field for stage
	Stage stage;
	
	@Override public void start(Stage primaryStage) {
		stage = primaryStage;
		
		//Build the click counter
		lblClicks = new Label();
		lblClicks.setText("You have not yet clicked the button");
		
		
		btnClickMe = new Button("Click me please");
		//Set button handler
		btnClickMe.setOnAction(e -> btnClickMe());
		
		btnSwitchToScene2 = new Button("Switch");
		btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2Click());
		
		//Create the GUI frame
		VBox panel = new VBox(10);
		panel.getChildren().addAll(lblClicks, btnClickMe, btnSwitchToScene2);
		
		scene1 = new Scene(panel, 250, 150);
		
		//Build the second scene
		lblCounter = new Label();
		lblCounter.setText(Integer.toString(iCounter));
		
		//Create buttons
		btnAdd = new Button("Add");
		btnSubtract = new Button("Subtract");
		btnSwitchToScene1 = new Button("Swicth to scene 1");
	
		//Set button handlers
		btnAdd.setOnAction(e -> btnAddClick());
		btnSubtract.setOnAction(e -> btnSubtractClick());
		btnSwitchToScene1.setOnAction(e -> btnSwitchToScene1Click());
		
		//Creeate new pane
		HBox pane2 = new HBox(10);
		pane2.getChildren().addAll(lblCounter, btnAdd, btnSubtract, btnSwitchToScene1);
		
		//Create second scene
		scene2 = new Scene(pane2, 300, 75);
		
		//Set the stage with scene 1
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Scene Switcher");
		primaryStage.show();
		

	}
	
	//Event handler for scene 1
	public void btnClickMe() {
		iClickCount++;
		lblClicks.setText("You have clicked " + iClickCount + " times");
	}
	
	//Event handler for scene switch
	public void btnSwitchToScene2Click() {
		stage.setScene(scene2);
	}
	
	//Event handlers for scene2
	
	private void btnAddClick() {
		iCounter++;
		lblCounter.setText(Integer.toString(iCounter));
	}
	
	private void btnSubtractClick() {
		iCounter--;
		lblCounter.setText(Integer.toString(iCounter));
	}
	
	private void btnSwitchToScene1Click() {
		stage.setScene(scene1);
	}
}
