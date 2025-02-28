package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

	public void start(Stage primaryStage) {
		CalculatorGUI calcgui = new CalculatorGUI(); //Constructeur par default
		calcgui.affiche(); //On lance la méthode qui permet d'afficher
	}
	
	public static void main(String[] args) {
		launch(args); 
	}
}

