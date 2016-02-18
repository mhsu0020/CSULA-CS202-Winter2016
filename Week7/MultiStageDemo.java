import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MultiStageDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();


		Stage secondStage = new Stage();
		secondStage.setTitle("Second Stage");
		secondStage.setScene(new Scene(new Label("This is exmaple of label")));
		int counter =0;
		while(counter<10){
			secondStage.hide();
			secondStage.show();
		}

	}
}
