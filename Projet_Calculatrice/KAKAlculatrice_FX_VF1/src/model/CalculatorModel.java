package model;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

import controler.CalculatorControler;

/**
 * Gere le modele et le comportement de la calculatrice
 * @param accu Contient ce que l'utilisateur veut ajouter dans la pile
 * @param pile Contient les differents elements ajoutes par l'utilisateur
 * @param calccontr Permet de faire le lien avec l'interface graphique via un controleur
 */
public class CalculatorModel implements CalculatorModelInterface{
	private String accu = "";
	private Stack<Double> pile = new Stack<Double>();
	private CalculatorControler calccontr;
	
	/**
	 * Permet d'obtenir l'accumulateur de la calculatrice
	 * @return l'accumulateur
	 */
	public String getAccu() {
		return accu;
	}
	
	/**
	 * 
	 * Permet d'ajouter les inputs de l'utilisateur dans l'accumulateur
	 * N'accepte que les nombres
	 */
	public void setAccu(String accu1) {
		try {
			String test = accu + accu1;
			Double.parseDouble(test); //Test pour verifier que le resultat est un nombre
			accu += accu1;
			calccontr.change(accu);
	        }
		catch (NumberFormatException e) {
	        }
		}
	
	/**
	 * Permet d'obtenir la pile de la calculatrice
	 * @return pile
	 */
	public Stack<Double> getPile() {
		return pile;
	}
	
	/**
	 * 
	 * Permet d'affecter de nouveaux elements a la pile
	 */
	public void setPile(Stack<Double> pile1) {
		pile = pile1;
	}
	
	/**
	 * Permet de retourner la liste des 4 premiers elements de la pile
	 * @return liste des 4 premiers elements de la pile
	 */
	public List<Double> creationListe4Derniers() {
		int size = pile.size();
		List<Double> liste = new ArrayList<>(); //liste qui va contenir les au plus 4 premiers elements de la pile
        if (size < 4) { 
            liste.addAll(pile);
        } else {
            for (int i = size - 4; i < size; i++) { //on ne veut que les 4 premiers elements de la pile
                liste.add(pile.get(i));
            }
        }
        return liste;
	}
	
	/**
	 * Permet de choisir le controler voulu
	 */
	public void setCalccontr(CalculatorControler calccontr1) {
		calccontr = calccontr1;
	}
	
	/**
	 * Methode qui somme les deux premiers elements de la pile
	 */
	public void add() {
		if (pile.size() >= 2) { //si la pile contient moins de deux elements, on ne peut pas sommer
			pile.add(pile.pop() + pile.pop());//on somme les deux premiers elements de la pile 
			List<Double> liste = this.creationListe4Derniers(); //creation de la liste a retourner a l'interface graphique
			calccontr.change(liste);
		}
	}

	/**
	 * Methode qui permet de soustraire les deux premiers elements de la pile
	 */
	public void substract() {
		if (pile.size() >= 2) { //si la pile contient moins de deux elements, on ne peut pas soustraire
			pile.add(pile.pop() - pile.pop()); //soustrait les 2 premiers elements de la pile
			List<Double> liste = this.creationListe4Derniers();
			calccontr.change(liste);
		}
	}
	
	/**
	 * Methode qui permet de multiplier les deux premiers elements de la pile
	 */
	public void multiply() {
		if (pile.size() >= 2) { //si la pile contient moins de deux elements, on ne peut pas multiplier
			pile.add(pile.pop() * pile.pop()); //multiplie les 2 premiers elements de la pile
			List<Double> liste = this.creationListe4Derniers();
			calccontr.change(liste);
		}
	}
	
	/**
	 * Methode qui permet de diviser les deux premiers elements de la pile
	 */
	public void divide() {
		if (pile.size() >= 2) { //si la pile contient moins de deux elements, on ne peut pas diviser
			double p1 = pile.pop(); // on recupere les 2 premiers elements de la pile 
			double p2 = pile.pop();
			if (p2 != 0) { //condition pour ne pas diviser par 0
				pile.add(p1 / p2); // on effectue la division
			}
			else { //sinon on remet les elements dans la pile
				pile.add(p2); 
				pile.add(p1);
			}
			List<Double> liste = this.creationListe4Derniers();
			calccontr.change(liste);
		}
	}
		
	/**
	 * Methode qui permet de changer de signe
	 */
	public void opposite() {
		if (!accu.isEmpty()) { //On ne veut pas afficher juste -
			if (accu.charAt(0) == '-') { //Si le nombre est negatif, on va le mettre en positif
				accu = accu.substring(1);
				calccontr.change(accu);
			}
			else {                       // Sinon, on le met en negatif
				accu = '-' + accu;
				calccontr.change(accu);
			}
		}
	}
	
	/**
	 * Methode qui permet de mettre le contenu de l'accumulateur dans la pile
	 */
	public void push() {
		if (!accu.isEmpty()) { //Si l'accumulateur est vide, on aura rien a mettre dans la pile
			pile.add(Double.parseDouble(accu));
			this.clear();      //vide l'accumulateur et le remet a 0 
			calccontr.change(accu);
			List<Double> liste = this.creationListe4Derniers();
			calccontr.change(liste);
		}
	}
	
	/**
	 * Methode pop qui permet d'obtenir le premier element d'une pile sans l'enlever de cette derniere
	 */
	public double pop() {
		if (!pile.isEmpty()) { //Si l'accumulateur est vide, on aura rien a enlever dans la pile
			double p = pile.pop();
			pile.add(p);
			return p;
		}
		else {
			return 0; //La condition de vide est déjà prise en compte dans les methodes
		}
	}
	
	/**
	 * Methode qui permet de supprimer le premier element d'une pile
	 */
	public void drop() {
		if (!pile.isEmpty()) { //Si l'accumulateur est vide, on aura rien a enlever dans la pile
			pile.pop();
		}
	}
	
	/**
	 * Methode qui permet d'echanger les positions des deux premiers elements d'une pile
	 */
	public void swap() {
		if (pile.size() >= 2) { //Si la pile contient moins de deux elements, on aura rien a echanger dans la pile
		double p1 = pile.pop();
		double p2 = pile.pop();
		pile.add(p1);
		pile.add(p2);
		List<Double> liste = this.creationListe4Derniers();
		calccontr.change(liste);
		}
	}
	
	/**
	 * Methode qui permet de vider le contenu de l'accumulateur
	 */
	public void clear() {
		accu = "";
		calccontr.change(""); //on affiche l'accumulateur vide dans le displayer
	}
	
	/**
	 * Methode qui permet de vider le contenu de la pile
	 */
	public void clearAll() {
		while(!pile.equals(new Stack<Double>())) {
			pile.pop();
		}
		calccontr.change(new ArrayList<Double>()); //On affiche la pile vide
	}
}
