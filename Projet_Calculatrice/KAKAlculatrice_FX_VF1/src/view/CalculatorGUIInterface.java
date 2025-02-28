package view;

import java.util.List;
/**
 * Interface qui va obliger CalculatorGUI a au moins avoir ces methodes
 */
public interface CalculatorGUIInterface {
	
	/**
	 * Va permettre de construire l'interface graphique de la calculatrice
	 */
	public void affiche();
	
	/**
	 * Permet d'afficher le contenu de l'accumulateur sur l'interface graphique
	 */
	public void change(String accu);
	
	/**
	 * Permet d'afficher les quatres premiers elements de la pile sur la fenetre graphique 
	 * (ou les premiers s'il y a moins de 4 elements dans la pile)
	 */
	public void change(List<Double> stackData);

}
