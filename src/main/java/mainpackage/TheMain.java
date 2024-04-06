package mainpackage;

import javafx.application.Application;
import javafx.stage.Stage;
import mainpackage.model.SceneHandler;


public class TheMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		SceneHandler.getSH().init(primaryStage);
	}

}
