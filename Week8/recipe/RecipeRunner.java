package recipe;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecipeRunner extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public static VBox getVBoxTextList(String titleString, ArrayList<String> textsToDisplay) {

		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10));
		vbox.setSpacing(8);
		Text title = new Text(titleString);
		title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		vbox.getChildren().add(title);
		for (String textToDisplay : textsToDisplay) {
			Text textNodeToDisplay = new Text(textToDisplay);
			VBox.setMargin(textNodeToDisplay, new Insets(0, 0, 0, 8));
			vbox.getChildren().add(textNodeToDisplay);
		}

		return vbox;

	}

	public static Recipe getRecipe(){

		Recipe recipe = new Recipe("Chicken Noodle soup", "Very very delcious soup", "RotisserieChickenNoodleSoup.jpeg");

		recipe.getSteps().add("1. cook chiken");
		recipe.getSteps().add("1. cook soup");
		recipe.getSteps().add("1. cook add salt");

		recipe.getIngredients().add("chicken");
		recipe.getIngredients().add("veggies");
		recipe.getIngredients().add("water");
		recipe.getIngredients().add("salt");

		return recipe;
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Chicken Noodle Soup");
		BorderPane border = new BorderPane();

		Recipe recipe = RecipeRunner.getRecipe();


		Image image = new Image(recipe.getImagePath());
		ImageView soupView = new ImageView(image);
		soupView.setFitHeight(100);
		soupView.setFitWidth(100);
		border.setCenter(soupView);

		VBox stepBox = RecipeRunner.getVBoxTextList("Steps", recipe.getSteps());
		VBox ingredientBox = RecipeRunner.getVBoxTextList("Ingredients", recipe.getIngredients());

		border.setLeft(stepBox);
		border.setRight(ingredientBox);




		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		//hbox.setStyle("-fx-background-color: #336699;");

		Button buttonCurrent = new Button("Current");
		buttonCurrent.setPrefSize(100, 20);
		buttonCurrent.getStyleClass().add("new-button");


		List<String> classes = buttonCurrent.getStyleClass();
		for(String s: classes){
			System.out.println(s);
		}

		Button buttonProjected = new Button("Projected");
		buttonProjected.setPrefSize(100, 20);

		hbox.getChildren().addAll(buttonCurrent, buttonProjected);

		border.setBottom(hbox);
		// border.setCenter(txt);

		Scene sc = new Scene(border, 300, 250);
		sc.getStylesheets().add("css/example.css");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
