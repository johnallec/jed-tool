package mainpackage.model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneHandler {
	
	private Parent root;
	private Scene scene;
	private FXMLLoader loader;
	private static final String MAIN_PAGE_TITLE = "JED tool";
	private static final String MAIN_PAGE_PATH = "/mainpackage/view/mainPage.fxml";
	private static final int MAIN_PAGE_WIDTH = 600;
	private static final int MAIN_PAGE_HEIGH = 500;
	private static SceneHandler instance = null;
	
	public static SceneHandler getSH() {
		if(instance == null)
			instance = new SceneHandler();
		return instance;
	}
	
	private SceneHandler() {
		loader = new FXMLLoader();
	}
	
	public void init(Stage stage) {
		setCurrentScene(MAIN_PAGE_PATH, MAIN_PAGE_WIDTH, MAIN_PAGE_HEIGH);
		stage.setScene(scene);
		stage.setTitle(MAIN_PAGE_TITLE);
		stage.show();
	}
	
	private void setCurrentScene(String path, int width, int height) {
		try {
			loader.setLocation(getClass().getResource(MAIN_PAGE_PATH));
			root = (Parent) loader.load();
			this.scene = new Scene(root, MAIN_PAGE_WIDTH, MAIN_PAGE_HEIGH);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void switchScene(Stage stage, String fxmlPath, String title, int width, int heigth) {
		setCurrentScene(fxmlPath, width, heigth);
		stage.setScene(scene);
		stage.setTitle(title);
		stage.show();
	}

}
