import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HBoxExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);

        Button buttonCurrent = new Button("Current");
        buttonCurrent.setPrefSize(100, 20);

        Button buttonProjected = new Button("Projected");
        buttonProjected.setPrefSize(100, 20);

        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        for (int i = 0; i < 6; i++) {
        	hbox.getChildren().add(new Button("Loop"+i));
		}
        Scene sc = new Scene(hbox, 300, 250);
        sc.getStylesheets().add("style.css");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
