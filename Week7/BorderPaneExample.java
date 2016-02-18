import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPaneExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Text txt = new Text("Hello, World!");
        Button b = new Button("Click me!");
        BorderPane border = new BorderPane();

        border.setBottom(b);
        border.setCenter(txt);

        Scene sc = new Scene(border, 300, 250);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
