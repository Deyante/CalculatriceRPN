package controler;

import java.util.List;
/**
 * Interface qui va obliger CalculatorControler a au moins avoir ces methodes
 */
public interface CalculatorControlerInterface {
	
	/**
	 * Permet d'appeler la methode de calcgui pour afficher le contenu de l'accumulateur
	 */
	public void change(String accu);
	
	/**
	 * Permet d'appeler la methode de calcgui pour afficher les 4 premiers elements de la pile
	 */
	public void change(List<Double> stackData);
	
}
