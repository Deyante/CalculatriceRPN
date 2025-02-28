package view;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import java.util.List;
import controler.CalculatorControler;

	/**
	 * Gere l'interface graphique HM 
	 * @param calccontr Permet de faire le lien entre l'interface graphique et le modele via un controleur
	 * @param displayLabel1 Affiche le contenu de l'accumulateur
	 * @param displayLabel2 Affiche le premier element de la pile
	 * @param displayLabel3 Affiche le deuxieme element de la pile
	 * @param displayLabel4 Affiche le troisieme element de la pile
	 * @param displayLabel5 Affiche le quatrieme element de la pile
	 * 
	 */
public class CalculatorGUI implements CalculatorGUIInterface{
	
	private CalculatorControler calccontr;
	private Label displayLabel1;
	private Label displayLabel2;
	private Label displayLabel3;
	private Label displayLabel4;
	private Label displayLabel5;
	
	/**
	 * Va permettre de construire l'interface graphique de la calculatrice
	 */
	public void affiche() {
		
		displayLabel1 = new Label("0"); //va contenir le contenu de l'accumulateur
        displayLabel1.setPrefHeight(50); //definie la hauteur
        displayLabel1.setMaxWidth(Double.MAX_VALUE); //evite que le displayer depasse la taille de la fenetre
        displayLabel1.setAlignment(Pos.TOP_RIGHT); //le positionne dans la partie haute et droite de la fenetre
        displayLabel1.setStyle("-fx-font-size: 24px; -fx-background-color: lightpink; -fx-padding: 10px; -fx-border-color: black;"); //police : 24px; couleur arriere plan : bleu clair; espace interne entre l'element affiche et le bord : 10 px; couleur de bordure : noir;
        
        displayLabel2 = new Label("0"); //Va contenir la premiere valeur de la pile
        displayLabel2.setPrefHeight(50);
        displayLabel2.setMaxWidth(Double.MAX_VALUE);
        displayLabel2.setAlignment(Pos.TOP_RIGHT);
        displayLabel2.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel3 = new Label("0"); //Va contenir la deuxieme valeur de la pile
        displayLabel3.setPrefHeight(50);
        displayLabel3.setMaxWidth(Double.MAX_VALUE);
        displayLabel3.setAlignment(Pos.TOP_RIGHT);
        displayLabel3.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel4 = new Label("0"); //Va contenir la troisieme valeur de la pile
        displayLabel4.setPrefHeight(50);
        displayLabel4.setMaxWidth(Double.MAX_VALUE);
        displayLabel4.setAlignment(Pos.TOP_RIGHT);
        displayLabel4.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
        
        displayLabel5 = new Label("0"); //Va contenir la quatrieme valeur de la pile
        displayLabel5.setPrefHeight(50);
        displayLabel5.setMaxWidth(Double.MAX_VALUE);
        displayLabel5.setAlignment(Pos.TOP_RIGHT);
        displayLabel5.setStyle("-fx-font-size: 24px; -fx-background-color: lightblue; -fx-padding: 10px; -fx-border-color: black;");
		
		//Creer les boutons, avec leur taille, la taille de la police et la forme du bouton
		Button b0 = new Button("0");
        b0.setPrefWidth(50); 
        b0.setPrefHeight(50);  
        b0.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");
    	
    	Button b1 = new Button("1");
        b1.setPrefWidth(50); 
        b1.setPrefHeight(50);  
        b1.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b2 = new Button("2");
        b2.setPrefWidth(50); 
        b2.setPrefHeight(50);  
        b2.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b3 = new Button("3");
        b3.setPrefWidth(50); 
        b3.setPrefHeight(50);  
        b3.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b4 = new Button("4");
        b4.setPrefWidth(50); 
        b4.setPrefHeight(50);  
        b4.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b5 = new Button("5");
        b5.setPrefWidth(50); 
        b5.setPrefHeight(50);  
        b5.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b6 = new Button("6");
        b6.setPrefWidth(50); 
        b6.setPrefHeight(50);  
        b6.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");
        
        Button b7 = new Button("7");
        b7.setPrefWidth(50); 
        b7.setPrefHeight(50);  
        b7.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b8 = new Button("8");
        b8.setPrefWidth(50); 
        b8.setPrefHeight(50);  
        b8.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");

        Button b9 = new Button("9");
        b9.setPrefWidth(50); 
        b9.setPrefHeight(50);  
        b9.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");
        
        Button bvirg = new Button(",");
        bvirg.setPrefWidth(50); 
        bvirg.setPrefHeight(50);  
        bvirg.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");
        
        Button bplus = new Button("+");
        bplus.setPrefWidth(80); 
        bplus.setPrefHeight(50);  
        bplus.setStyle("-fx-font-size: 16px");
        
        Button bmoins = new Button("-");
        bmoins.setPrefWidth(80); 
        bmoins.setPrefHeight(50);  
        bmoins.setStyle("-fx-font-size: 16px");
        
        Button bfois = new Button("*");
        bfois.setPrefWidth(80); 
        bfois.setPrefHeight(50);  
        bfois.setStyle("-fx-font-size: 16px");
        
        Button bdiviser = new Button("/");
        bdiviser.setPrefWidth(80); 
        bdiviser.setPrefHeight(50);  
        bdiviser.setStyle("-fx-font-size: 16px");

        Button benter = new Button("<>");
        benter.setPrefWidth(80); 
        benter.setPrefHeight(50);  
        benter.setStyle("-fx-background-color: lightgreen; -fx-border-color: darkblue; -fx-font-size: 16px");
        
        Button bops = new Button("+/-");
        bops.setPrefWidth(80); 
        bops.setPrefHeight(50);  
        bops.setStyle("-fx-font-size: 16px; -fx-background-radius : 100");
        
        Button bclear = new Button("C");
        bclear.setPrefWidth(50); 
        bclear.setPrefHeight(50);  
        bclear.setStyle("-fx-background-color: red;-fx-font-size: 16px");
        
        Button bclearall = new Button("CA");
        bclearall.setPrefWidth(50); 
        bclearall.setPrefHeight(50);  
        bclearall.setStyle("-fx-background-color: red;-fx-font-size: 16px");
        
        Button bswap = new Button("<->");
        bswap.setPrefWidth(50); 
        bswap.setPrefHeight(50);  
        bswap.setStyle("-fx-font-size: 16px");
        
        // Créer un GridPane
        GridPane gridpane = new GridPane(); //Va permettre de ranger les elements dans des espaces d'un grid (ici en bas a gauche)
        gridpane.setAlignment(Pos.BOTTOM_LEFT);
        gridpane.setStyle("-fx-background-color: lightblue;");
        gridpane.setVgap(2); //met un espace vertical entre les objets
        gridpane.setHgap(2); //met un espace horizontal entre les objets

        // Ajouter des contraintes de colonnes pour créer de l'espace
        gridpane.getColumnConstraints().add(new ColumnConstraints(20)); // Colonne 0
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 1
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 2
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 3
        gridpane.getColumnConstraints().add(new ColumnConstraints(50)); // Colonne 4
        gridpane.getColumnConstraints().add(new ColumnConstraints(80)); // Colonne 5 

        // Positionner les boutons
        GridPane.setConstraints(b0, 2, 3); //Colonne 2 ligne 3
        GridPane.setConstraints(b1, 1, 0); //Colonne 1 ligne 0
        GridPane.setConstraints(b2, 2, 0); //etc
        GridPane.setConstraints(b3, 3, 0);
        GridPane.setConstraints(b4, 1, 1);
        GridPane.setConstraints(b5, 2, 1);
        GridPane.setConstraints(b6, 3, 1);
        GridPane.setConstraints(b7, 1, 2);
        GridPane.setConstraints(b8, 2, 2);
        GridPane.setConstraints(b9, 3, 2);
        GridPane.setConstraints(bvirg, 1, 3);
        GridPane.setConstraints(bplus, 5, 3); 
        GridPane.setConstraints(bmoins, 5, 2);
        GridPane.setConstraints(bfois, 5, 1);
        GridPane.setConstraints(bdiviser, 5, 0);
        GridPane.setConstraints(benter, 5,4);
        GridPane.setConstraints(bops, 3, 3);
        GridPane.setConstraints(bclear, 1, 4);
        GridPane.setConstraints(bclearall, 3, 4);
        GridPane.setConstraints(bswap, 2, 4);

        // Ajouter tous les éléments au grid
        gridpane.getChildren().addAll(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bvirg, bops, bplus, bmoins, bfois, bdiviser, benter, bclear, bclearall, bswap);
        
        //Concatener les boites d'affichages et les boutons
        VBox root = new VBox(displayLabel5, displayLabel4, displayLabel3, displayLabel2, displayLabel1, gridpane);
        
        // Créer la scène et afficher
        Scene scene = new Scene(root, 320, 540); // taille de la fenetre: horizontal x vertical
        Stage stage = new Stage();
        stage.setResizable(false); // permet de faire en sorte de ne plus agrandir la taille de la fenetre (esthetisme)
        stage.setScene(scene);
        stage.setTitle("Calculatrice");
        stage.show();
        
       // Gestion de la pression des boutons
        calccontr = new CalculatorControler(this); //On construit un controler, cela permet d'utiliser les methodes de CalculatorControler
        
        b0.addEventHandler(ActionEvent.ACTION, //lorsque le bouton 0 est presse, on appelle le controler qui va demander au modele comment reagir
        		e -> {
        		calccontr.boutonChiffreAppuye(b0.getText());
        });
        
        b1.addEventHandler(ActionEvent.ACTION, // de meme pour tous les chiffres et operations
        		e -> {
        		System.out.println(calccontr);
        		calccontr.boutonChiffreAppuye(b1.getText());
        });
        
        b2.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b2.getText());
        });
        
        b3.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b3.getText());
        });
        
        b4.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b4.getText());
        });
        
        b5.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b5.getText());
        });
        
        b6.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b6.getText());
        });
        
        b7.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b7.getText());
        });
        
        b8.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b8.getText());
        });
        
        b9.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(b9.getText());
        });
        
        bvirg.addEventHandler(ActionEvent.ACTION,
        		e -> {
        		calccontr.boutonChiffreAppuye(".");
        });
        
        bmoins.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonMoinsPresse();
        		});
        
        bplus.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonPlusPresse();
        		}); 
        
        bfois.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonFoisPresse();
        		});
        
        bdiviser.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonDiviserPresse();
        		});
        
        benter.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonEntréePresse();
        		});
        
        bclear.addEventHandler(ActionEvent.ACTION,  
        		e -> {
        			calccontr.boutonClearPresse();
        		});
        
        bclearall.addEventHandler(ActionEvent.ACTION, 
        		e -> {
        			calccontr.boutonClearAllPresse();
        		});
        
        bops.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonOpsPresse();
        		});
        
        bswap.addEventHandler(ActionEvent.ACTION,
        		e -> {
        			calccontr.boutonSwapPresse();
        		});
    }
	
	/**
	 * Permet d'afficher le contenu de l'accumulateur sur l'interface graphique
	 */
	public void change(String accu) {
        displayLabel1.setText(accu);
        }
		
	/**
	 * Permet d'afficher les quatres premiers elements de la pile sur la fenetre graphique 
	 * (ou les premiers s'il y a moins de 4 elements dans la pile)
	 */
	public void change(List<Double> stackData) { //stackData contient la liste des 4 premiers elements de la pile
        int size = stackData.size(); //Me permet de connaitre son nombre d'elements	
        if (size ==0) { //il n'y a rien dans la pile
        	displayLabel2.setText("0");
    		displayLabel3.setText("0");
    		displayLabel4.setText("0");
    		displayLabel5.setText("0");
        }
        if (size==1) { //il y a un element dans la pile, il faut donc afficher cet element dans la premiere boite au dessus de celle de l'accumulateur (la deuxieme en partant du bas) et mettre 0 pour les autres
    		displayLabel2.setText(Double.toString(stackData.get(0)));
    		displayLabel3.setText("0");
    		displayLabel4.setText("0");
    		displayLabel5.setText("0");
    	}
    	if (size==2) { //Deux elements dans la pile, il faut afficher ces deux elements dans la deuxieme et troisieme boite en partant du bas
    		displayLabel2.setText(Double.toString(stackData.get(1)));
    		displayLabel3.setText(Double.toString(stackData.get(0)));
    		displayLabel4.setText("0");
    		displayLabel5.setText("0");
    	}
    	if (size==3) { //même logique
    		displayLabel2.setText(Double.toString(stackData.get(2)));
    		displayLabel3.setText(Double.toString(stackData.get(1)));
    		displayLabel4.setText(Double.toString(stackData.get(0)));
    		displayLabel5.setText("0");
   		}
        if (size==4) { //on affiche les 4 premiers elements de la pile par ordre croissant de nouveaute en partant du bas
        	displayLabel2.setText(Double.toString(stackData.get(3)));
    		displayLabel3.setText(Double.toString(stackData.get(2)));
    		displayLabel4.setText(Double.toString(stackData.get(1)));
    		displayLabel5.setText(Double.toString(stackData.get(0)));
        	}
	}
}


