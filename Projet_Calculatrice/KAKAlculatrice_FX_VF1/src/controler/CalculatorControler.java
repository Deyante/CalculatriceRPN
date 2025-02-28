package controler;

import java.util.List;

import model.CalculatorModel;
import view.CalculatorGUI;

/**
 * Gere le lien entre le modele (=le fonctionnement de la calculatrice) et l'interface graphique HM
 * @param calcmod Le modele de la calculatrice que nous allons utiliser
 * @param calcgui Le modele de l'interface graphique que nous allons utiliser
 */
public class CalculatorControler implements CalculatorControlerInterface{
	private CalculatorModel calcmod;
	private CalculatorGUI calcgui;
	
	/**
	 * Permet d'obtenir le modele de la calculatrice
	 * @return calcmod
	 */
	public CalculatorModel getCalcMod() {
		return calcmod;
	}
	
	/**
	 * Constructeur de CalculatorControler, cela permet de resoudre le probleme de dependance circulaire
	 */
	public CalculatorControler(CalculatorGUI calcgui1) {
		calcgui = calcgui1;
		calcmod = new CalculatorModel(); 
		calcmod.setCalccontr(this); //permet d'attribuer un controler au modele, fait le lien entre CalculatorModel et CalculatorControler
	}
	
	/**
	 * Permet d'appeler la methode de calcgui pour afficher le contenu de l'accumulateur
	 */
	public void change(String accu) {
		calcgui.change(accu);
	}
	
	/**
	 * Permet d'appeler la methode de calcgui pour afficher les 4 premiers elements de la pile
	 */
	public void change(List<Double> stackData) {
		calcgui.change(stackData);
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur un bouton chiffre
	 */
	public void boutonChiffreAppuye(String text) {
		calcmod.setAccu(text);
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton moins
	 */
	public void boutonMoinsPresse() {
		calcmod.substract();
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton plus
	 */
	public void boutonPlusPresse() {
		calcmod.add();
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton fois
	 */
	public void boutonFoisPresse() {
		calcmod.multiply();
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton diviser
	 */
	public void boutonDiviserPresse() {
		calcmod.divide();
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton entree
	 */
	public void boutonEntréePresse() {
		calcmod.push();	
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton clear
	 */
	public void boutonClearPresse() { 
		calcmod.clear();	
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton ClearAll (CA)
	 */
	public void boutonClearAllPresse() { 
		calcmod.clearAll();	
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton +/-
	 */
	public void boutonOpsPresse() {
		calcmod.opposite();
	}
	
	/**
	 * Permet de demander au modele de la calculatrice comment reagir lorsque l'utilisateur appuie sur le bouton <->
	 */
	public void boutonSwapPresse() {
		calcmod.swap();
	}
}
