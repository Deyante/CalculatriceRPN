package model;
/**
 * Interface qui va obliger CalculatorModel a au moins avoir ces methodes
 */
public interface CalculatorModelInterface {

	/**
	 * Methode qui somme les deux premiers elements de la pile
	 */
	public void add();
	
	/**
	 * Methode qui permet de soustraire les deux premiers elements de la pile
	 */
	public void substract();
	
	/**
	 * Methode qui permet de multiplier les deux premiers elements de la pile
	 */
	public void multiply();
	
	/**
	 * Methode qui permet de diviser les deux premiers elements de la pile
	 */
	public void divide();
	
	/**
	 * Methode qui permet de changer de signe
	 */
	public void opposite();
	
	/**
	 * Methode qui permet de mettre le contenu de l'accumulateur dans la pile
	 */
	public void push();
	
	/**
	 * Methode pop qui permet d'obtenir le premier element d'une pile sans l'enlever de cette derniere
	 */
	public double pop();
	
	/**
	 * Methode qui permet de supprimer le premier element d'une pile
	 */
	public void drop();
	
	/**
	 * Methode qui permet d'echanger les positions des deux premiers elements d'une pile
	 */
	public void swap();
	
	/**
	 * Methode qui permet de vider le contenu de l'accumulateur
	 */
	public void clear();
	
}
