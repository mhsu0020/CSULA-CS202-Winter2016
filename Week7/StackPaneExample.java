import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Text txt = new Text("Hello, World!");
        Button b = new Button("Click me!");
        StackPane root = new StackPane();
        root.getChildren().add(txt);
        root.getChildren().add(b);
        Scene sc = new Scene(root, 300, 250);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
