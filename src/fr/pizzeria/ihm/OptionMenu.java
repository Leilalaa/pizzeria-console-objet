package fr.pizzeria.ihm;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;



public abstract class OptionMenu {

	protected Pizza[] pizzas;
	protected Scanner sc;
	
	public OptionMenu(Scanner sc, Pizza[] pizzas) {
		this.sc = sc;
		this.pizzas = pizzas;
	}
	
		
	

}
